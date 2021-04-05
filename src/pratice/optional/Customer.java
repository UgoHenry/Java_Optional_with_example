package pratice.optional;

import java.util.Optional;

public class Customer {
    private Optional<Car> car;
    Customer(Car c){this.car = Optional.of(c);}
    Customer(){car = Optional.empty();}
    public Optional <Car> getCar(){return car;}

}
