import java.util.*;

public class Main{
    public static void main (String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((b-a)%c ==0? (b-a)/c : (b-a)/c+1);
    }
}