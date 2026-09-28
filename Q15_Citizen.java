public class Q15_Citizen {

    // Passport Class
    public static class Passport {
        private String passportNo;
        private String issueDate;
        private String expiryDate;

        // Default Constructor
        public Passport() {
            this.passportNo = "";
            this.issueDate = "";
            this.expiryDate = "";
        }

        // Parameterized Constructor
        public Passport(String passportNo, String issueDate, String expiryDate) {
            this.passportNo = passportNo;
            this.issueDate = issueDate;
            this.expiryDate = expiryDate;
        }

        // Getters and Setters
        public String getPassportNo() {
            return passportNo;
        }

        public void setPassportNo(String passportNo) {
            this.passportNo = passportNo;
        }

        public String getIssueDate() {
            return issueDate;
        }

        public void setIssueDate(String issueDate) {
            this.issueDate = issueDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
        }
    }

    // Citizen Class
    public static class Citizen {
        private String name;
        private String dob;
        private String address;
        private Passport passport;

        // Default Constructor
        public Citizen() {
            this.name = "";
            this.dob = "";
            this.address = "";
            this.passport = null;
        }

        // Parameterized Constructor
        public Citizen(String name, String dob, String address, Passport passport) {
            this.name = name;
            this.dob = dob;
            this.address = address;
            this.passport = passport;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Passport getPassport() {
            return passport;
        }

        public void setPassport(Passport passport) {
            this.passport = passport;
        }

        // Override toString()
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Citizen: ").append(name).append(" DOB: ").append(dob).append(" Address: ").append(address).append("\n");
            sb.append(passport.toString());
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Create Passport
        Passport passport = new Passport("P123456", "01-01-2020", "01-01-2030");

        // Create Citizen
        Citizen citizen = new Citizen("Ravi", "01-01-1990", "Delhi", passport);

        // Print Citizen Details
        System.out.println(citizen);
    }
}
