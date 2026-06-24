// package exceptionhandling.customexceptions;

public class Example {
    // Array index out of bounds
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,4,5};
        try{
            System.out.println(arr[10]);
        } catch(Exception e) {
            System.out.println("Some error occured while accesing the array element" + e.getMessage());
        }
    }
}
