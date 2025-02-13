package models;

public class planAction {
    private int idPlanAction;
    private int incidentId;
    private String etapes;
    private String responsables;
    private String resultats;

    public planAction() {
    }

    public planAction(int idPlanAction, int incidentId, String etapes, String responsables, String resultats) {
        this.idPlanAction = idPlanAction;
        this.incidentId = incidentId;
        this.etapes = etapes;
        this.responsables = responsables;
        this.resultats = resultats;
    }

    public planAction(int incidentId, String etapes, String responsables, String resultats) {
        this.incidentId = incidentId;
        this.etapes = etapes;
        this.responsables = responsables;
        this.resultats = resultats;
    }

    public int getIdPlanAction() {
        return idPlanAction;
    }

    public void setIdPlanAction(int idPlanAction) {
        this.idPlanAction = idPlanAction;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getEtapes() {
        return etapes;
    }

    public void setEtapes(String etapes) {
        this.etapes = etapes;
    }

    public String getResponsables() {
        return responsables;
    }

    public void setResponsables(String responsables) {
        this.responsables = responsables;
    }

    public String getResultats() {
        return resultats;
    }

    public void setResultats(String resultats) {
        this.resultats = resultats;
    }

    @Override
    public String toString() {
        return "planAction{" +
                "idPlanAction=" + idPlanAction +
                ", incidentId=" + incidentId +
                ", etapes='" + etapes + '\'' +
                ", responsables='" + responsables + '\'' +
                ", resultats='" + resultats + '\'' +
                '}';
    }
}
