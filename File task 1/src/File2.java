import java.io.*;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        //file name
        String fileName = "Sample.txt";
        
        // Word to search
        String word = "Java";   
        int count = 0;

        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()) {
                if (input.next().equalsIgnoreCase(word)) {
                    count++;
                }
            }
            input.close();
            System.out.println("Word \"" + word + "\" Present here " + count + " times.");
        } catch (Exception e) {
            System.out.println("File not found: " + fileName);
        }
    }
}

