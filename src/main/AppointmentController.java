    private static class EnhancedAppointment {
        private Appointment appointment;
        private User client;
        private Agent agent;
        private Property property;
        

        // Getters and Setters
        public Appointment getAppointment() {
            return appointment;
        }

        
        public void setAppointment(Appointment appointment) {
            this.appointment = appointment;
        }

        public User getClient() {
            return client;
        }

        public void setClient(User client) {
            this.client = client;
        }

        public Agent getAgent() {
            return agent;
        }

        public void setAgent(Agent agent) {
            this.agent = agent;
        }

        public Property getProperty() {
            return property;
        }

        public void setProperty(Property property) {
            this.property = property;
        }
    }

