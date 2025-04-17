import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Patterns{
    public static void main(String args[])
    {
        // Pattern p =  Pattern.compile("are");
        // Matcher matcher = p.matcher("hi, how are you?");
        // boolean isFound = matcher.find();   use "find" for searching the substring in the string
        // System.out.println(isFound);

        Pattern p =  Pattern.compile("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$");
        Matcher matcher = p.matcher("7890 2123 4563");
        boolean isFound = matcher.matches();
        System.out.println(isFound);
    }
}