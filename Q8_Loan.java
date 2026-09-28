public class Q8_Loan {

    // Abstract Loan Class
    public static abstract class Loan {
        protected double principal;
        protected double rate;
        protected int time;

        // Parameterized Constructor
        public Loan(double principal, double rate, int time) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;
        }

        // Getters and Setters
        public double getPrincipal() {
            return principal;
        }

        public void setPrincipal(double principal) {
            this.principal = principal;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        // Abstract method for calculating interest
        // Formula: SI = (PRT)/100
        public abstract double calculateInterest();

        @Override
        public abstract String toString();
    }

    // Home Loan Class
    public static class HomeLoan extends Loan {
        private static final double HOME_LOAN_RATE = 8.0;

        public HomeLoan(double principal, int time) {
            super(principal, HOME_LOAN_RATE, time);
        }

        @Override
        public double calculateInterest() {
            // SI = (PRT)/100
            return (principal * rate * time) / 100;
        }

        @Override
        public String toString() {
            return "Home Loan Interest: " + calculateInterest();
        }
    }

    // Car Loan Class
    public static class CarLoan extends Loan {
        private static final double CAR_LOAN_RATE = 10.0;

        public CarLoan(double principal, int time) {
            super(principal, CAR_LOAN_RATE, time);
        }

        @Override
        public double calculateInterest() {
            // SI = (PRT)/100
            return (principal * rate * time) / 100;
        }

        @Override
        public String toString() {
            return "Car Loan Interest: " + calculateInterest();
        }
    }

    public static void main(String[] args) {
        // Create Home Loan
        Loan homeLoan = new HomeLoan(500000, 8);
        System.out.println(homeLoan);

        // Create Car Loan
        Loan carLoan = new CarLoan(300000, 5);
        System.out.println(carLoan);
    }
}
