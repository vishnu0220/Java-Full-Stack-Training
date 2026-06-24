// package exceptionhandling.customexceptions;

public class Recursive {
    public static void main(String[] args) {
        recursiveMethod();
    }
    static void recursiveMethod() {
        try{
            recursiveMethod();
        } catch (Exception e) {
            System.out.println("Error! : " + e.getMessage());
        }
    }
}
