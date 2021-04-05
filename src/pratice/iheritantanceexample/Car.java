package pratice.iheritantanceexample;

    public class Car extends Vehicle {
        private boolean convertible;

        public Car(int maxSpeed, boolean convertible) {
            // calling the constructor of the parent class
            super(maxSpeed);
            this.convertible = convertible;
        }

        public boolean isConvertible() {
            return convertible;
        }

        @Override
        public String toString() {
            // super.toString() - calling the toString() method from parent class
            // and adding more functionality to suit the child class needs
            return (isConvertible()?"convertible ":"") + super.toString();
        }
    }
