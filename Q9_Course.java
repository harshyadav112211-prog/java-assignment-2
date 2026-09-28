public class Q9_Course {

    // Course Class
    public static class Course {
        private String courseName;
        private String duration;

        // Default Constructor
        public Course() {
            this.courseName = "";
            this.duration = "";
        }

        // Parameterized Constructor
        public Course(String courseName, String duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        // Getters and Setters
        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        // Override toString()
        @Override
        public String toString() {
            return courseName + " (" + duration + ")";
        }
    }

    // Student Class
    public static class Student {
        protected String name;
        protected Course enrolledCourse;

        // Default Constructor
        public Student() {
            this.name = "";
            this.enrolledCourse = null;
        }

        // Parameterized Constructor
        public Student(String name, Course enrolledCourse) {
            this.name = name;
            this.enrolledCourse = enrolledCourse;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Course getEnrolledCourse() {
            return enrolledCourse;
        }

        public void setEnrolledCourse(Course enrolledCourse) {
            this.enrolledCourse = enrolledCourse;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Student: " + name + " Course: " + enrolledCourse.toString();
        }
    }

    // Premium Student Class extends Student
    public static class PremiumStudent extends Student {
        private double discount;

        // Default Constructor
        public PremiumStudent() {
            super();
            this.discount = 0;
        }

        // Parameterized Constructor
        public PremiumStudent(String name, Course enrolledCourse, double discount) {
            super(name, enrolledCourse);
            this.discount = discount;
        }

        // Getters and Setters
        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Premium Student: " + name + " Course: " + enrolledCourse.toString() + " Discount: " + discount + "%";
        }
    }

    public static void main(String[] args) {
        // Create Course
        Course course = new Course("Java", "3 months");

        // Create Student
        Student student = new Student("Arjun", course);
        System.out.println(student);

        // Create Premium Student
        PremiumStudent premiumStudent = new PremiumStudent("Meena", course, 20);
        System.out.println(premiumStudent);
    }
}
