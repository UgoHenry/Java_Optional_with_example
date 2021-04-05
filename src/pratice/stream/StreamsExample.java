package pratice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Oliver", "Kaisi", "Charles", "Gerli", "Henry", "Tarmo", "Maksim", "Andrei",
                "Karel", "Margo A", "Henri", "Jelena", "Maria Helena");
        System.out.println("List of names:");
        System.out.println(names);
        System.out.println("List of names starting with M:");
        List<String> namesStartingWithM = names.stream()
                .filter(name -> name.startsWith("M")).collect(Collectors.toList());
        System.out.println(namesStartingWithM);
        System.out.println("The lengths of each name from list:");
        List<Integer> namesLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(namesLengths);
        System.out.println("The average length of names:");
        OptionalDouble averageNameLength = namesLengths.stream().mapToInt(Integer::intValue).average();
        averageNameLength.ifPresent(d -> System.out.printf("%.2f%n", d));
        System.out.println("Do all names have at least 5 letters?");
        System.out.println(names.stream().allMatch(s -> s.length() >= 5));
        System.out.println("Is there any name with more than 7 letters?");
        System.out.println(names.stream().anyMatch(s -> s.length() > 7));
        System.out.println("Concatenated names:");
        Optional<String> namesConcatenation = names.stream().reduce((currValue, element) -> currValue += " | " + element);
        System.out.println(namesConcatenation.orElse("empty list of names"));
        System.out.println("List of names with lengths:");
        names.stream().forEach(s -> System.out.println(s + " has " + s.length() + " letters"));
        List<Person> persons = Arrays.asList(
                new Person("Anna", "Johnson", 25),
                new Person("John", "Smith", 18),
                new Person("Jane", "Peters", 30),
                new Person("Chris", "Black", 28),
                new Person("Joe", "Sanders", 50)
        );
        System.out.println("List of persons:");
        System.out.println(persons);
        System.out.println("\nList of persons sorted by last name:");
        persons.stream().sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName())).forEach(System.out::println);
        System.out.println("\nList of persons sorted by age ascending:");
        persons.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(System.out::println);
        System.out.println("\nList of persons sorted by age descending:");
        persons.stream().sorted((p1, p2) -> -(p1.getAge() - p2.getAge())).forEach(System.out::println);
    }
}
