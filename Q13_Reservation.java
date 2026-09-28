import java.util.ArrayList;
import java.util.List;

public class Q13_Reservation {

    // Guest Class
    public static class Guest {
        private String name;
        private int age;
        private String idProof;

        // Default Constructor
        public Guest() {
            this.name = "";
            this.age = 0;
            this.idProof = "";
        }

        // Parameterized Constructor
        public Guest(String name, int age, String idProof) {
            this.name = name;
            this.age = age;
            this.idProof = idProof;
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

        public String getIdProof() {
            return idProof;
        }

        public void setIdProof(String idProof) {
            this.idProof = idProof;
        }

        // Override toString()
        @Override
        public String toString() {
            return name + "," + age + "," + idProof;
        }
    }

    // Reservation Class
    public static class Reservation {
        private String reservationId;
        private String roomType;
        private List<Guest> guests;

        // Default Constructor
        public Reservation() {
            this.reservationId = "";
            this.roomType = "";
            this.guests = new ArrayList<>();
        }

        // Parameterized Constructor
        public Reservation(String reservationId, String roomType) {
            this.reservationId = reservationId;
            this.roomType = roomType;
            this.guests = new ArrayList<>();
        }

        // Getters and Setters
        public String getReservationId() {
            return reservationId;
        }

        public void setReservationId(String reservationId) {
            this.reservationId = reservationId;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public List<Guest> getGuests() {
            return guests;
        }

        public void setGuests(List<Guest> guests) {
            this.guests = guests;
        }

        // Add Guest
        public void addGuest(Guest guest) {
            guests.add(guest);
        }

        // Override toString()
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Reservation ID: ").append(reservationId).append(" Room: ").append(roomType).append("\n");
            sb.append("Guests:\n");
            for (Guest guest : guests) {
                sb.append(guest.toString()).append("\n");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        // Create Reservation
        Reservation reservation = new Reservation("R101", "Deluxe");

        // Create and add Guests
        Guest guest1 = new Guest("Amit", 25, "ID123");
        Guest guest2 = new Guest("Sara", 22, "ID456");

        reservation.addGuest(guest1);
        reservation.addGuest(guest2);

        // Print Reservation Details
        System.out.println(reservation);
    }
}
