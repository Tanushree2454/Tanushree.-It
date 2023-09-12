import java.util.Scanner;
public class PythagoreanTriplet{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 3 numbers ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Pythagorean(a,b,c);
    }
    public static void Pythagorean(int a ,int b ,int c) {
        if(a*a==b*b+c*c||b*b==c*c+a*a||c*c==a*a+b*b)
        System.out.println("PythagoreanTriplet");
        else
        System.err.println("Not Pythagorean Triplet");
    }
}