public class Q11_Hostel {

    // Room Class
    public static class Room {
        private String roomNumber;
        private String block;
        private String type; // Single/Double

        // Default Constructor
        public Room() {
            this.roomNumber = "";
            this.block = "";
            this.type = "";
        }

        // Parameterized Constructor
        public Room(String roomNumber, String block, String type) {
            this.roomNumber = roomNumber;
            this.block = block;
            this.type = type;
        }

        // Getters and Setters
        public String getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getBlock() {
            return block;
        }

        public void setBlock(String block) {
            this.block = block;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Room: " + roomNumber + " " + block + " " + type;
        }
    }

    // Student Class
    public static class Student {
        private String name;
        private String roll;
        private String course;
        private Room room;

        // Default Constructor
        public Student() {
            this.name = "";
            this.roll = "";
            this.course = "";
            this.room = null;
        }

        // Parameterized Constructor
        public Student(String name, String roll, String course, Room room) {
            this.name = name;
            this.roll = roll;
            this.course = course;
            this.room = room;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRoll() {
            return roll;
        }

        public void setRoll(String roll) {
            this.roll = roll;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public Room getRoom() {
            return room;
        }

        public void setRoom(Room room) {
            this.room = room;
        }

        // Override toString()
        @Override
        public String toString() {
            return "Student: " + name + " (" + roll + ") " + course + " " + room.toString();
        }
    }

    public static void main(String[] args) {
        // Create Room
        Room room = new Room("A101", "Block-B", "Single");

        // Create Student
        Student student = new Student("Ravi", "101", "CSE", room);

        // Print Student Details
        System.out.println(student);
    }
}
