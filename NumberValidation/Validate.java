import java.util.Scanner;

public class Validate{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Integer len = n.length();
        Integer c = 0, tot=0;
       
        if( len>= 13 && len <= 16 )
        {
            if(n.charAt(1) == '4' || n.charAt(1) == '5' || n.charAt(1) == '6')
            {
                for(int i=len-1;i>=0;i--)
                {
                     if(i%2 == 0)
                    {
                        int f = Integer.parseInt(String.valueOf(n.charAt(i)))*2; 
                        // System.out.println(f);
                        if((String.valueOf(f)).length()>1)
                        {
                            while(f>0)
                            {
                                int val = f%10;
                                c+=val;
                                f=f/10;
                            }
                        }
                        else
                        {
                            c+=f;
                        }
                    }
                }
            }
        }
        

        if((String.valueOf(c)).length()>1)
        {
            while(c>0)
            {
                int val = c%10;
                tot+=val;
                c=c/10;
            }
        }
        System.out.println(tot);
        
    }
}