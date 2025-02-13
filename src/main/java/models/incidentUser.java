package models;

public class incidentUser {
    public class IncidentUser {
        private int incidentId;
        private int idUser;

        // Constructeur par défaut
        public IncidentUser() {
        }

        // Constructeur avec paramètres
        public IncidentUser(int incidentId, int idUser) {
            this.incidentId = incidentId;
            this.idUser = idUser;
        }

        // Getters et Setters
        public int getIncidentId() {
            return incidentId;
        }

        public void setIncidentId(int incidentId) {
            this.incidentId = incidentId;
        }

        public int getIdUser() {
            return idUser;
        }

        public void setIdUser(int idUser) {
            this.idUser = idUser;
        }

        @Override
        public String toString() {
            return "IncidentUser{" +
                    "incidentId=" + incidentId +
                    ", idUser=" + idUser +
                    '}';
        }
    }

}
