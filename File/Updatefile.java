import java.io.FileWriter;
import java.io.File;

public class Updatefile{
    public static void main(String args[])
    {
        File file = new File("java.txt");
        try{
        if(file.exists())
        {
            FileWriter filewriter = new FileWriter("java.txt", true);
            filewriter.append(". It seems very low today");
            filewriter.close();
            // file.delete(); if this command is executed the file will gets deleted
        }
        else{
            System.out.println("File not found...");
        }
        } 
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}