import java.io.*;

public class Mainfile {
	
	    public static void main(String[] args) {
	        String File1 = "Sample1.txt";      
	        String File2 = "Sample2.txt";    

	        try (
	             BufferedReader br = new BufferedReader(new FileReader(File1));
	            BufferedWriter bw = new BufferedWriter(new FileWriter(File2)))
	         
	        {
	            String line;
	            while ((line = br.readLine()) != null) 
	            {
	                bw.write(line);
	                bw.newLine();
	            }

	           
	            bw.write("end of file");
	            bw.newLine();

	            System.out.println("Copied successfully from " + File1 + " to " + File2);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


