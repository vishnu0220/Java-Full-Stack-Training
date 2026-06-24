// package exceptionhandling.predefinedexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("samplefee.txt");
        BufferedReader br = new BufferedReader(file);

        String line;
        
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Handled IOException" + e.getMessage());
        }
    }
}
