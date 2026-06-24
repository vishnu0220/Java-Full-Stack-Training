// package exceptionhandling.customexceptions;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class InvalidAge {
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    static void validateAge(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("Your must be atleast 18 years of old!");
        }
    }
}
