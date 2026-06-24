public class ImmuttableExample {
    public static void main (String args[]) {
        Integer a = 10;
        System.out.println(System.identityHashCode(a));
        System.out.println(a);
        a += 5;
        Integer b = 15;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(a);
    }
}