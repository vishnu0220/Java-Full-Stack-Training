import java.util.*;
public class EndsWithExample {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Vishnu", "Manoj", "Amol", "Rahul");

        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        names.stream().filter(name -> name.endsWith("l")).forEach(System.out::println);
        
        List<Integer> num = Arrays.asList(1,2,3,4,5,10,9,8,7,6);
        num.stream().sorted().forEach(System.out::println);
    }
}