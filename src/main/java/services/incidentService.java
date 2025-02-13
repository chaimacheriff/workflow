package services;

import models.incident;
import tools.MyDataBase;
import java.sql.Timestamp;

import java.sql.*;
import java.util.*;


public class incidentService implements iService<incident> {
    private Connection cnx;
    public incidentService(){
        cnx=MyDataBase.getInstance().getCnx();}
    @Override
    public void ajouter(incident i) throws SQLException {
        String sql="insert into incident (titreIncident,descriptionIncident,dateHeureIncident,categorieIncident,statutIncident,rapportIncident )values(?,?,?,?,?,?)";
        PreparedStatement st=cnx.prepareStatement(sql);
        st.setString(1,i.getTitreIncident());
        st.setString(2,i.getDescriptionIncident());
        st.setTimestamp(3, new Timestamp(i.getDateHeureIncident().getTime()));
        st.setString(4,i.getCategorieIncident());
        st.setString(5,i.getStatutIncident());
        st.setString(6,i.getRapportIncident());

        st.executeUpdate();
        System.out.println("Incident ajoutée");

        }

    @Override
    public void supprimer(int idIncident) throws SQLException {
        String sql = "DELETE FROM incident WHERE idIncident = ?";
        try (PreparedStatement st = cnx.prepareStatement(sql)) {
            st.setInt(1, idIncident); // Utilisation de l'ID passé en paramètre
            int rowsDeleted = st.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Incident supprimé avec succès !");
            } else {
                System.out.println("Aucun incident trouvé avec l'ID : " + idIncident);
            }
        }
    }

    @Override
    public void modifier(int idIncident, incident i) throws SQLException {
        String sql = "UPDATE incident SET titreIncident = ?, descriptionIncident = ?, dateHeureIncident = ?, categorieIncident = ?, statutIncident = ?, rapportIncident = ?, planActionId = ? WHERE idIncident = ?";
        try (PreparedStatement st = cnx.prepareStatement(sql)) {
            st.setString(1, i.getTitreIncident());
            st.setString(2, i.getDescriptionIncident());
            st.setTimestamp(3, new Timestamp(i.getDateHeureIncident().getTime()));
            st.setString(4, i.getCategorieIncident());
            st.setString(5, i.getStatutIncident());
            st.setString(6, i.getRapportIncident());
            st.setObject(7, i.getPlanActionId(), Types.INTEGER); // Gestion des valeurs NULL
            st.setInt(8, idIncident); // Utilisation de l'ID passé en paramètre

            int rowsUpdated = st.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Incident modifié avec succès !");
            } else {
                System.out.println("Aucun incident trouvé avec l'ID : " + idIncident);
            }
        }
    }

    @Override
    public List<incident> recuperer() throws SQLException {
        String sql = "SELECT * FROM incident";
        List<incident> incidents = new ArrayList<>();

        try (Statement st = cnx.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                incident i = new incident();
                i.setIdIncident(rs.getInt("idIncident"));
                i.setTitreIncident(rs.getString("titreIncident"));
                i.setDescriptionIncident(rs.getString("descriptionIncident"));
                i.setDateHeureIncident(rs.getTimestamp("dateHeureIncident"));
                i.setCategorieIncident(rs.getString("categorieIncident"));
                i.setStatutIncident(rs.getString("statutIncident"));
                i.setRapportIncident(rs.getString("rapportIncident"));

                Integer planActionId = rs.getInt("planActionId");
                if (!rs.wasNull()) {
                    i.setPlanActionId(planActionId);
                }

                incidents.add(i);
            }
        }

        return incidents;
    }
}

