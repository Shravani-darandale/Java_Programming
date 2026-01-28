//Accept File Name from User and Open That File

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class program56_1
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter file name : ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        
        if (!file.exists()) 
        {
            try 
            {
                if (file.createNewFile())
                {
                    System.out.println("File '" + fileName + "' did not exist, so it was created.");
                } 
                
                else
                {
                    System.out.println("Error: Could not create the file. Check permissions or path.");
                    scanner.close();
                    return;
                }

            } 
            
            catch (IOException e) 
            {
                System.out.println("Error creating file: " + e.getMessage());
                scanner.close();
                return;
            }

        } 
        
        else 
        {
            System.out.println("File '" + fileName + "' already exists.");
        }
     
        try 
        {
            Scanner fileScanner = new Scanner(file);
            System.out.println("File opened. Contents:");
            boolean hasContent = false;
            while (fileScanner.hasNextLine()) 
                {
                    System.out.println(fileScanner.nextLine());
                    hasContent = true;
                }

            if (!hasContent) 
                {
                System.out.println("(The file is empty.)");
                }

            fileScanner.close();
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening file: " + e.getMessage());
        }
        
        scanner.close();
    }
}