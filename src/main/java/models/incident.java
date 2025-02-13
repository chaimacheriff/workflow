package models;

import java.util.*;

public class incident {
    private int idIncident;
    private String titreIncident;
    private String descriptionIncident;
    private Date dateHeureIncident;
    private String categorieIncident;
    private String statutIncident;
    private String rapportIncident;
    private Integer planActionId; //

    public incident() {
    }

    public incident(int idIncident, String titreIncident, String descriptionIncident, Date dateHeureIncident, String categorieIncident, String statutIncident, String rapportIncident, Integer planActionId) {
        this.idIncident = idIncident;
        this.titreIncident = titreIncident;
        this.descriptionIncident = descriptionIncident;
        this.dateHeureIncident = dateHeureIncident;
        this.categorieIncident = categorieIncident;
        this.statutIncident = statutIncident;
        this.rapportIncident = rapportIncident;
        this.planActionId = planActionId;
    }

    public incident(String titreIncident, String descriptionIncident, Date dateHeureIncident, String categorieIncident, String statutIncident, String rapportIncident) {
        this.titreIncident = titreIncident;
        this.descriptionIncident = descriptionIncident;
        this.dateHeureIncident = dateHeureIncident;
        this.categorieIncident = categorieIncident;
        this.statutIncident = statutIncident;
        this.rapportIncident = rapportIncident;
    }

    public int getIdIncident() {
        return idIncident;
    }

    public void setIdIncident(int idIncident) {
        this.idIncident = idIncident;
    }

    public String getTitreIncident() {
        return titreIncident;
    }

    public void setTitreIncident(String titreIncident) {
        this.titreIncident = titreIncident;
    }

    public String getDescriptionIncident() {
        return descriptionIncident;
    }

    public void setDescriptionIncident(String descriptionIncident) {
        this.descriptionIncident = descriptionIncident;
    }

    public Date getDateHeureIncident() {
        return dateHeureIncident;
    }

    public void setDateHeureIncident(Date dateHeureIncident) {
        this.dateHeureIncident = dateHeureIncident;
    }

    public String getCategorieIncident() {
        return categorieIncident;
    }

    public void setCategorieIncident(String categorieIncident) {
        this.categorieIncident = categorieIncident;
    }

    public String getStatutIncident() {
        return statutIncident;
    }

    public void setStatutIncident(String statutIncident) {
        this.statutIncident = statutIncident;
    }

    public String getRapportIncident() {
        return rapportIncident;
    }

    public void setRapportIncident(String rapportIncident) {
        this.rapportIncident = rapportIncident;
    }

    public Integer getPlanActionId() {
        return planActionId;
    }

    public void setPlanActionId(Integer planActionId) {
        this.planActionId = planActionId;
    }

    @Override
    public String toString() {
        return "incident{" +
                "idIncident=" + idIncident +
                ", titreIncident='" + titreIncident + '\'' +
                ", descriptionIncident='" + descriptionIncident + '\'' +
                ", dateHeureIncident=" + dateHeureIncident +
                ", categorieIncident='" + categorieIncident + '\'' +
                ", statutIncident='" + statutIncident + '\'' +
                ", rapportIncident='" + rapportIncident + '\'' +
                ", planActionId=" + planActionId +
                '}';
    }
}



