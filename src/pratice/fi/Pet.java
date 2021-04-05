package pratice.fi;

import java.util.ArrayList;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(int age) {
        this("Bella", age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Nagini", 7));
        pets.add(new Pet("Crookshanks"));
        pets.add(new Pet(6));

        for (Pet pet: pets) {
            System.out.print(pet + ", ");
        }
    }
}



