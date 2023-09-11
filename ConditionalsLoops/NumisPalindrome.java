import java.util.Scanner;

public class NumisPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int temp = n ;
int r;
int Reverse=0;
        while(temp!=0){
            r  = temp%10;
           // System.out.print(r);
           Reverse =Reverse* 10+r;
            temp/=10;
        }
System.out.println(Reverse);
        if(n==Reverse)
        System.out.println("\n"+"is Palindrome .");
        else
        System.out.println("\n"+"is not palindrome ");
    }
}
