import java.util.*;
public class interest {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double p,r,t,si;
    System.out.println("Enter Principal amount, rate, time .");
    p = sc.nextDouble();
    r = sc.nextDouble();
    t = sc.nextDouble();
    si = (p*r*t)/100;
    System.out.println("Simple Interest  "+si);
    }
    
}
