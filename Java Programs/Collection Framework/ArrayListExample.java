import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        /*
            Methods
            1. add(ele);
            2. remove(ele);
            3. get(index);
            4. size();

        */
        names.add("Vishnu");
        names.add("vardhan");
        System.out.println(names);
        for(String str : names)
            System.out.println(str);
    }
}
