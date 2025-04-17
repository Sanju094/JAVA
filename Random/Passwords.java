import java.util.Random;
// import java.util.StringBuilder;

public class Passwords{
    public static void main(String args[])
    {
        String  data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(data.charAt(random.nextInt(0,23)));
        sb.append(data.charAt(random.nextInt(24,55)));
        sb.append(data.charAt(random.nextInt(56,65)));
        sb.append(data.charAt(random.nextInt(66,data.length())));

        for(int i=0;i<4;i++)
        {
            sb.append(data.charAt(random.nextInt(0,data.length())));
        }
        System.out.println(sb.toString());

        UUID uid = UUID.randomUUID();
        System.out.println(uid.toString());
    }
}