//Accept File Name from User and Write Data at the End of That File

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program56_3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter data to append: ");
        String data = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter(fileName, true)) 
        {
            writer.write(data + "\n");
            System.out.println("Data appended successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}