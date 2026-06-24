import java.util.*;
public class Main {
    static void printList(List<?> list) {
        for(Object obj : list)
            System.out.println(obj);
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<String> list2 = Arrays.asList( "One", "Two", "Three");
        printList(list1);
        printList(list2);
    }
}
