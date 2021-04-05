package pratice.streamAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla","Ellisha","Eamonn");
        List<Integer> values = Arrays.asList(1 ,4 ,2346 ,123 ,76 ,11 ,0 ,0 ,62 ,23);

        System.out.println("List of Names sorted:");
        names.stream().sorted().forEach(name -> System.out.print(name +" "));

        System.out.println("\n\nList of Values sorted:");
        values.stream().sorted().forEach(value -> System.out.print(value +" "));

        System.out.println("\n\nList of names starting with E:");
        List<String> namesStartingWithE = names.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());
        System.out.println(namesStartingWithE);

        System.out.println("\nPrint values greater than 30 and lower than 200: ");
        values.stream().filter(x->x>30&&x<200).forEach(value -> System.out.print(value +" "));

        System.out.println("\n\nPrint names uppercase: ");
        names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name +" "));

        System.out.println("\n\n Remove first and last letter , sort and print names: ");
        names.stream().map(nam -> nam.substring(1,nam.length()-1)).sorted().forEach(nam -> System.out.print(nam +" "));

        System.out.println("\n\n Sort backwards by implementing reverse Comparator and using lambda expression: ");
        names.stream().sorted((s1,s2) -> - s1.compareTo(s2)).forEach(name -> System.out.print(name +" "));
        System.out.println();




    }
}
