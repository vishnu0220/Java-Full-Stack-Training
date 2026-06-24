// package exceptionhandling.predefinedexceptions;

public class Throw {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18) {
            throw new ArithmeticException("User is not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
