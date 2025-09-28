package Assignment3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
	
	
	    public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(new File("C:\\Users\\OneDrive\\Documents\\Python BCA\\mobile\\test.txt"));

	            int lines = 0, words = 0, chars = 0;

	            while (sc.hasNextLine()) {
	                String line = sc.nextLine();
	                lines++;                  // count line
	                chars += line.length();   // count characters
	                words += line.split(" ").length; // count words
	            }

	            System.out.println("Lines: " + lines);
	            System.out.println("Words: " + words);
	            System.out.println("Characters: " + chars);

	            sc.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found!");
	        }
	    }
	}
	
	
	
	


