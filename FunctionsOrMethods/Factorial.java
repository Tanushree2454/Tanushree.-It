import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt()   ;
   Fact(n);
    }
    public static void Fact(int n) {
        int prd =1;
        for(int i=n;i>0;i--){
            prd*= n;
           n= n-1;
        }
        System.out.println("Factorial is = "+prd);
    }
}