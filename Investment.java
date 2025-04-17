import java.util.Arrays;

public class Investment extends Thread{
    public Integer sum = 0;
    @Override
    public void run()
    { 
        int a[] = {2,4,6,8,10,12,34,22,66,33};
        sum = Arrays.stream(a).sum();  
    }
    
    
}