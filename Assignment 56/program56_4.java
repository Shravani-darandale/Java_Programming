//Accept file name from user and create new file if it does not exist

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program56_4 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        if (file.exists())
        {
            System.out.println("File already exists.");
        } 
        else
             {
            try
             {
                if (file.createNewFile())
                {
                    System.out.println("File created successfully.");
                } 
                else
                {
                    System.out.println("Failed to create file.");
                }
            }
             catch (IOException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}