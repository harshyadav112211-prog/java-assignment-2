public class Q3_Employee {

    // Employee Class
    public static class Employee {
        private String name;
        private String id;
        private double basicSalary;

        // Default Constructor
        public Employee() {
            this.name = "";
            this.id = "";
            this.basicSalary = 0;
        }

        // Parameterized Constructor
        public Employee(String name, String id, double basicSalary) {
            this.name = name;
            this.id = id;
            this.basicSalary = basicSalary;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }

        // Calculate Salary Method
        public double calculateSalary() {
            return basicSalary;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
        }
    }

    // Manager Class extends Employee
    public static class Manager extends Employee {
        private double bonus;

        // Default Constructor
        public Manager() {
            super();
            this.bonus = 0;
        }

        // Parameterized Constructor with Constructor Chaining
        public Manager(String name, String id, double basicSalary, double bonus) {
            super(name, id, basicSalary);
            this.bonus = bonus;
        }

        // Getter and Setter for bonus
        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        // Override calculateSalary()
        @Override
        public double calculateSalary() {
            return getBasicSalary() + bonus;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Manager " + getName() + " (" + getId() + ") Salary: " + calculateSalary();
        }
    }

    public static void main(String[] args) {
        // Create Employee
        Employee emp = new Employee("Ravi", "E101", 30000);
        System.out.println(emp);

        // Create Manager
        Manager mgr = new Manager("Seema", "M202", 40000, 5000);
        System.out.println(mgr);
    }
}
