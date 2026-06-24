// package exceptionhandling.predefinedexceptions;

import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(file);
            try {
                String line;
                while((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                // return;
            }catch(IOException e) {
                System.out.println("Some exception occured!" + e.getMessage());
            }
            br.close();
            // return;
        } catch (IOException e) {
            System.out.println("File not found");
            // return;
        } finally {
            System.out.println("This is a finally block!!");
        }
    }   
}
