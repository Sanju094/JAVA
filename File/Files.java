import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Files{
    public static void main(String args[])
    {
        File file = new File("java.txt");
        if(file.exists())
        {
            System.out.println("File exists");
            try{
                BufferedReader fileReader = new BufferedReader(new FileReader("java.txt")); //BufferedReader is efficient for reading the large amount of data
                String text = null;
                while((text = fileReader.readLine()) != null){
                    System.out.println(text);
                }
                fileReader.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else
        {   
            FileWriter filewriter = null;
            try
            {
                filewriter.write("Hi, I am not good");
                System.out.println("File created successfully");
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            finally
            {
                if(filewriter != null)
                { 
                    try{
                        filewriter.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}