import java.util.Map;
import java.util.LinkedHashMap;

public class Linkedhashmap{
    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> browserhistory = new LinkedHashMap<Integer, String>();
        browserhistory.put(1,"abc");
        browserhistory.putLast(2,"opq");
        browserhistory.putFirst(4,"uhf");
        browserhistory.put(0,"grw");
        System.out.println(browserhistory.values());
        System.out.println(browserhistory.get(0));
    }
}