public class Q5_Hospital {

    // Person Class
    public static class Person {
        private String name;
        private int age;

        // Default Constructor
        public Person() {
            this.name = "";
            this.age = 0;
        }

        // Parameterized Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Name: " + name + "\n" + "Age: " + age;
        }
    }

    // Doctor Class extends Person
    public static class Doctor extends Person {
        private String specialization;

        // Default Constructor
        public Doctor() {
            super();
            this.specialization = "";
        }

        // Parameterized Constructor
        public Doctor(String name, int age, String specialization) {
            super(name, age);
            this.specialization = specialization;
        }

        // Getters and Setters
        public String getSpecialization() {
            return specialization;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }

        // Override toString()
        @Override
        public String toString() {
            return super.toString() + "\n" + "Specialization: " + specialization;
        }
    }

    // Surgeon Class extends Doctor
    public static class Surgeon extends Doctor {
        private String surgeryType;

        // Default Constructor
        public Surgeon() {
            super();
            this.surgeryType = "";
        }

        // Parameterized Constructor
        public Surgeon(String name, int age, String specialization, String surgeryType) {
            super(name, age, specialization);
            this.surgeryType = surgeryType;
        }

        // Getters and Setters
        public String getSurgeryType() {
            return surgeryType;
        }

        public void setSurgeryType(String surgeryType) {
            this.surgeryType = surgeryType;
        }

        // Override toString()
        @Override
        public String toString() {
            return super.toString() + "\n" + "Surgery Type: " + surgeryType;
        }
    }

    public static void main(String[] args) {
        // Create Surgeon
        Surgeon surgeon = new Surgeon("John", 40, "Cardiology", "Heart Surgery");

        // Print Surgeon Details
        System.out.println(surgeon);
    }
}
