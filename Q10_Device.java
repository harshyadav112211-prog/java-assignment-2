public class Q10_Device {

    // Interface Device
    public interface Device {
        void turnOn();
        void turnOff();
    }

    // Fan Class implementing Device
    public static class Fan implements Device {
        private String name;
        private boolean isOn;

        // Parameterized Constructor
        public Fan(String name) {
            this.name = name;
            this.isOn = false;
        }

        // Getters
        public String getName() {
            return name;
        }

        public boolean isOn() {
            return isOn;
        }

        @Override
        public void turnOn() {
            isOn = true;
            System.out.println(name + " is now ON");
        }

        @Override
        public void turnOff() {
            isOn = false;
            System.out.println(name + " is now OFF");
        }
    }

    // Light Class implementing Device
    public static class Light implements Device {
        private String name;
        private boolean isOn;

        // Parameterized Constructor
        public Light(String name) {
            this.name = name;
            this.isOn = false;
        }

        // Getters
        public String getName() {
            return name;
        }

        public boolean isOn() {
            return isOn;
        }

        @Override
        public void turnOn() {
            isOn = true;
            System.out.println(name + " is now ON");
        }

        @Override
        public void turnOff() {
            isOn = false;
            System.out.println(name + " is now OFF");
        }
    }

    public static void main(String[] args) {
        // Create Fan Device
        Device fan = new Fan("Fan");
        fan.turnOn();
        fan.turnOff();

        // Create Light Device
        Device light = new Light("Light");
        light.turnOn();
        light.turnOff();
    }
}
