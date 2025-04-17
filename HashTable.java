import java.util.Hashtable; //Hashtable will be used for multithreading environment
import java.util.Enumeration;

public class HashTable{
    public static void main(String args[])
    {
        Hashtable<String,String> memorycache = new Hashtable<String, String>();
        memorycache.put("Google","www.google.com");
        memorycache.put("Bing","www.bing.com");
        memorycache.put("Youtube","www.youtube.com");

        System.out.println(memorycache.get("Google"));
        System.out.println(memorycache.keySet()); //RETRIVE ALL THE KEYS
        System.out.println(memorycache.values()); //RETRIEVE ALL THE VALUES
        System.out.println(memorycache.contains("Bing")); //contains() is the collection method it searches only in the values "Bing" is not the value so it returns "false"

        // Enumeration<String> dnsList = memorycache.elements();  // enumeration is used to loop through the values(elements) or keys(keys);
        // while(dnsList.hasMoreElements()){
        //     System.out.println(dnsList.nextElement());
        // }
        Enumeration<String> dnsKeys = memorycache.keys();  // enumeration is used to loop through the values(elements) or keys(keys);
        while(dnsKeys.hasMoreElements()){
            String key = dnsKeys.nextElement();
            System.out.println(key + ":" + memorycache.get(key));
        }
    }
}