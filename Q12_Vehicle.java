public class Q12_Vehicle {

    // Vehicle Base Class
    public static class Vehicle {
        protected String regNo;
        protected String brand;
        protected double baseRate;

        // Parameterized Constructor
        public Vehicle(String regNo, String brand, double baseRate) {
            this.regNo = regNo;
            this.brand = brand;
            this.baseRate = baseRate;
        }

        // Getters and Setters
        public String getRegNo() {
            return regNo;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getBaseRate() {
            return baseRate;
        }

        public void setBaseRate(double baseRate) {
            this.baseRate = baseRate;
        }

        // Calculate Rental Rate
        public double calculateRate() {
            return baseRate;
        }

        @Override
        public String toString() {
            return regNo + " " + brand + " Rent: " + calculateRate();
        }
    }

    // Car Class extends Vehicle
    public static class Car extends Vehicle {
        public Car(String regNo, String brand, double baseRate) {
            super(regNo, brand, baseRate);
        }

        @Override
        public double calculateRate() {
            // rate = baseRate * 1.5
            return baseRate * 1.5;
        }

        @Override
        public String toString() {
            return "Car " + regNo + " " + brand + " Rent: " + calculateRate();
        }
    }

    // Bike Class extends Vehicle
    public static class Bike extends Vehicle {
        public Bike(String regNo, String brand, double baseRate) {
            super(regNo, brand, baseRate);
        }

        @Override
        public double calculateRate() {
            // rate = baseRate * 1.2
            return baseRate * 1.2;
        }

        @Override
        public String toString() {
            return "Bike " + regNo + " " + brand + " Rent: " + calculateRate();
        }
    }

    public static void main(String[] args) {
        // Create Car
        Vehicle car = new Car("KA01AA1234", "Toyota", 1000);
        System.out.println(car);

        // Create Bike
        Vehicle bike = new Bike("KA05BB6789", "Honda", 500);
        System.out.println(bike);
    }
}
