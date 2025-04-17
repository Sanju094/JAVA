import java.util.HashMap;
import java.util.Map;
public class Hashmap{
    public static void main(String args[])
    {
        HashMap<Integer,String> stuList = new HashMap<Integer,String>();
        stuList.put(3, "Abc");
        stuList.put(1, "Def");
        stuList.put(5, "Ghi");
        System.out.println(stuList.get(3));
        for(Map.Entry<Integer, String> stu: stuList.entrySet())
        {
            System.out.println(stu.getKey() + ":" + stu.getValue());
        }
        stuList.remove(1);
    }
}