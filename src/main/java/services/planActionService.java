package services;

import models.planAction;
import tools.MyDataBase;
import java.sql.*;
import java.util.*;

public class planActionService implements iService<planAction> {
    private Connection cnx;

    public planActionService() {
        cnx = MyDataBase.getInstance().getCnx();
    }

    @Override
    public void ajouter(planAction p) throws SQLException {
        String sql = "INSERT INTO planAction (incidentId,etapes, responsables, resultats) VALUES ( ? ,?, ?, ?)";
        try (PreparedStatement st = cnx.prepareStatement(sql)) {
            st.setString(1, String.valueOf(p.getIncidentId()));
            st.setString(2, p.getEtapes());
            st.setString(3, p.getResponsables());
            st.setString(4, p.getResultats());
            st.executeUpdate();
            System.out.println("Plan d'action ajouté avec succès !");
        }
    }

    @Override
    public void supprimer(int idPlanAction) throws SQLException {
        String sql = "DELETE FROM planAction WHERE idPlanAction = ?";
        try (PreparedStatement st = cnx.prepareStatement(sql)) {
            st.setInt(1, idPlanAction);
            int rowsDeleted = st.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Plan d'action supprimé avec succès !");
            } else {
                System.out.println("Aucun plan d'action trouvé avec l'ID : " + idPlanAction);
            }
        }
    }

    @Override
    public void modifier(int idPlanAction, planAction p) throws SQLException {
        String sql = "UPDATE planAction SET incidentId = ?, etapes = ?, responsables = ?, resultats = ? WHERE idPlanAction = ?";
        try (PreparedStatement st = cnx.prepareStatement(sql)) {
            st.setInt(1, p.getIncidentId());
            st.setString(2, p.getEtapes());
            st.setString(3, p.getResponsables());
            st.setString(4, p.getResultats());
            st.setInt(5, idPlanAction);
            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Plan d'action modifié avec succès !");
            } else {
                System.out.println("Aucun plan d'action trouvé avec l'ID : " + idPlanAction);
            }
        }
    }

    @Override
    public List<planAction> recuperer() throws SQLException {
        String sql = "SELECT * FROM planAction";
        List<planAction> plans = new ArrayList<>();
        try (Statement st = cnx.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                planAction p = new planAction();
                p.setIdPlanAction(rs.getInt("idPlanAction"));
                p.setIncidentId(rs.getInt("incidentId"));
                p.setEtapes(rs.getString("etapes"));
                p.setResponsables(rs.getString("responsables"));
                p.setResultats(rs.getString("resultats"));
                plans.add(p);
            }
        }
        return plans;
    }
}
