//Accept file name from user and display contents of that file on screen
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program56_2
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        try 
        {
            Scanner fileScanner = new Scanner(new File(fileName));
            System.out.println("Contents:");

            while (fileScanner.hasNextLine()) 
            {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
        scanner.close();
    }
}