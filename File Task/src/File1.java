
import java.io.*;

public class File1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Sample.txt");
            int ch;
            StringBuilder sb = new StringBuilder();

           
            while ((ch = fin.read()) != -1) {
                sb.append((char) ch);
            }
            fin.close();

            String str = sb.toString();

            // Display content in uppercase
            System.out.println("File in UPPERCASE ");
            System.out.println(str.toUpperCase());

            // Display content in reverse
            StringBuffer rssb = new StringBuffer(str);
            System.out.println("File in Reverse Order ");
            System.out.println(rssb.reverse());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
