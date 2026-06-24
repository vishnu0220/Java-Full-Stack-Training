public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        int number = -10;
        try {
            checkNumber(number);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    public static void checkNumber(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else {
            System.out.println("Valid number");
        }
    }
}
