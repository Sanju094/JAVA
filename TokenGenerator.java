public class TokenGenerator extends Thread{
    public static int token = 0;
    @Override
    public void run()
    {
        generateToken();
    }
    public synchronized void generateToken()
    {
        token++;
        System.out.println(token + "is generated");
    }
                                     //or
    //  public void generateToken()
    // {
    //    synchronized(this)
    //    {
    //     token++;
    //     System.out.println(token + "is generated");
    //    }
    // }
}