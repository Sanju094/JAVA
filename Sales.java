import java.util.Arrays;

public class Sales extends Thread{
    public Integer sum = 0;
    @Override
    public void run()
    {    
        int a[] = {90,45,22,77,9,11,3,6,8,23};
        sum = Arrays.stream(a).sum();
    }
    
    
}