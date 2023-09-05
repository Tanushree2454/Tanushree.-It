import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
        int Time = sc.nextInt();
        int rate = sc.nextInt();
        double Principal = sc.nextDouble();
        double SI = (Time*rate*Principal)/100;
        System.out.println(SI);
    }
}
