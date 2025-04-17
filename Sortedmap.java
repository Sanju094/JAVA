import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class Sortedmap
{
    public static void main(String args[])
    {
        SortedMap<Integer, String> routeList = new TreeMap<Integer, String>();
        routeList.put(2,"hi");
        routeList.put(4,"hello");
        routeList.put(5,"how");
        routeList.put(1,"are");
        routeList.put(0,"you");
        System.out.println(routeList.keySet());
        System.out.println(routeList.values());

        for(Map.Entry<Integer, String> rou: routeList.entrySet())
        {
            System.out.println(rou.getKey() + ":" + rou.getValue());
        }
    }
}