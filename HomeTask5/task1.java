package HomeTask5;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class task1 {
    static String fileName = "myfile.txt";

    public static void WriteFile(File file, String content)
    {
        try
        {
            String fileContent = ReadFile(file);

            if(fileContent.equals(""))
            {
                FileWriter writer = new FileWriter(file, false);
                writer.write(content);
                writer.close();
            }
            else 
            {
                FileWriter writer = new FileWriter(file, true);
                writer.write('\n' + content);
                writer.close();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static String ReadConsole()
    {
        Scanner userScanner = new Scanner(System.in, "cp1251");
        StringBuilder result = new StringBuilder();

        while(userScanner.hasNextLine())
        {
            result.append(userScanner.nextLine() + '\n');
        }
        userScanner.close();
        return result.toString().trim();
    }
    public static String ReadFile(File file)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder result = new StringBuilder();         
            String line;

            while((line = reader.readLine()) != null)
            {
                result.append(line + '\n');
            }
            reader.close();

            return result.toString().trim();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static File GetFile(String name)
    {
        File myFile = new File(name);

        if(myFile.exists())
            return myFile;
        else
        {
            try
            {
                myFile.createNewFile();
                System.out.println("Success! File was created!");
                return myFile;
            }
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
                return null;
            }        
        }
    }
    public static void main(String[] args) {
        File myfile = GetFile(fileName);
        String fileContent = ReadFile(myfile);
        System.out.println("File content:\n" + fileContent);

        System.out.println("Enter string:");
        String consoleContent = ReadConsole();

        WriteFile(myfile, consoleContent);
    }
}
