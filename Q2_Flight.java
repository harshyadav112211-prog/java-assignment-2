public class Q2_Flight {

    // Abstract Flight Class
    public static abstract class Flight {
        private String flightNumber;
        private String airline;
        private double fare;

        public Flight(String flightNumber, String airline, double fare) {
            this.flightNumber = flightNumber;
            this.airline = airline;
            this.fare = fare;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getAirline() {
            return airline;
        }

        public double getFare() {
            return fare;
        }

        public abstract double calculateFare();

        @Override
        public String toString() {
            return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + calculateFare();
        }
    }

    // Domestic Flight Class
    public static class DomesticFlight extends Flight {
        public DomesticFlight(String flightNumber, String airline, double fare) {
            super(flightNumber, airline, fare);
        }

        @Override
        public double calculateFare() {
            // Fare = base fare + 10% tax
            return getFare() + (getFare() * 0.10);
        }
    }

    // International Flight Class
    public static class InternationalFlight extends Flight {
        public InternationalFlight(String flightNumber, String airline, double fare) {
            super(flightNumber, airline, fare);
        }

        @Override
        public double calculateFare() {
            // Fare = base fare + 25% tax
            return getFare() + (getFare() * 0.25);
        }
    }

    public static void main(String[] args) {
        // Create Flights
        Flight domestic = new DomesticFlight("AI202", "Air India", 5000);
        Flight international = new InternationalFlight("QF101", "Qantas", 20000);

        // Print Flight Details
        System.out.println(domestic);
        System.out.println(international);
    }
}
