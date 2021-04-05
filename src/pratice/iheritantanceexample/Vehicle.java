package pratice.iheritantanceexample;

    public class Vehicle {
        private int maxSpeed;

        public Vehicle(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        @Override
        public String toString() {
            // using getClass() method from Object class
            // (default parent class for classes that don't extend a specific class)
            // to get the name of the class
            return getClass().getSimpleName().toLowerCase()+ " with a maximum speed of " + maxSpeed + " km/h";
        }
    }

