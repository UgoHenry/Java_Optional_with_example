package pratice.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(new Car(Make.TOYOTA));
        String make = getCustomerCarMake(c).map(Make::name).orElse("Unknown");
        System.out.println(make);


    }
    public static Optional <Make> getCustomerCarMake(Customer customer){
            return customer.getCar().map(Car::getMake);
    }
}
