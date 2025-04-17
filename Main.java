public class Main{
    public static void main(String args[])
    {
        Investment in = new Investment();
        in.start();
        Sales ss = new Sales();
        ss.start();
        ss.yield(); // when two task come at the same time then one task need to leave a way (because only one process can be taken place at a time) so, by using yield() here sales class will say that investment can execute
        try{
            in.join();
            ss.join();
        }
        catch(InterruptedException e)
        {
           e.printStackTrace();
        }
        Integer profit;
        profit = ss.sum - in.sum;
        System.out.println(profit);
        Thread.currentThread().setName("Store Profit loss determination");
        System.out.println(Thread.currentThread().getPriority());// normally the thread have 5 as priority and always the main method have high priority

        System.out.println(Thread.currentThread().getName()); //to get the name of the thread
    
    }
}