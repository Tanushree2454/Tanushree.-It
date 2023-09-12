import java.util.Scanner;
public class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
product(a, b);
       double x= sc.nextDouble();
       double y = sc.nextDouble();
System.out.println(sum(x,y));
    }
    public static void product(int a , int b) {
        System.out.println("Product = "+(a*b));
    }
     public static double  sum(double a , double b) {
        return  a+b;
    }
}