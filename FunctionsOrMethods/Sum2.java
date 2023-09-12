import java.util.Scanner;
public class Sum2{
    public static void main(String[] args) {
int ans = sum2();
System.out.println("Sum = " + ans);
ans = sum2();
System.out.println("sum = " +ans);
int ans2 = sum3(1, 3);
System.out.println("sum ="+ans2);
    }
    static int sum2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no ");
    int n1 = sc.nextInt();
    System.out.println("enter 2nd no ");
    int n2  = sc.nextInt();
    int sum = n1+n2;
    return sum ;
}
static int sum3(int a, int b){
    int sum =a+b;
    return sum;
}
}