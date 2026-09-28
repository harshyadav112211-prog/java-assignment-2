import java.util.ArrayList;
import java.util.List;

public class Q1_Department {
    private String deptName;
    private String hodName;
    private List<Q1_Professor> professors;

    // Default Constructor
    public Q1_Department() {
        this.deptName = "";
        this.hodName = "";
        this.professors = new ArrayList<>();
    }

    // Parameterized Constructor
    public Q1_Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    // Getters and Setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Q1_Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Q1_Professor> professors) {
        this.professors = professors;
    }

    // Add Professor Method
    public void addProfessor(Q1_Professor p) {
        professors.add(p);
    }

    // Override toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(deptName).append("\n");
        sb.append("HOD: ").append(hodName).append("\n");
        sb.append("Professors:\n");
        for (Q1_Professor prof : professors) {
            sb.append(prof.toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create Department
        Q1_Department dept = new Q1_Department("Computer Science", "Dr. Mehta");

        // Create and add Professors
        Q1_Professor prof1 = new Q1_Professor("Arjun", "P101", "AI");
        Q1_Professor prof2 = new Q1_Professor("Neha", "P102", "ML");

        dept.addProfessor(prof1);
        dept.addProfessor(prof2);

        // Print Department Details
        System.out.println(dept);
    }
}

class Q1_Professor {
    private String name;
    private String employeeId;
    private String specialization;

    // Default Constructor
    public Q1_Professor() {
        this.name = "";
        this.employeeId = "";
        this.specialization = "";
    }

    // Parameterized Constructor
    public Q1_Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}
