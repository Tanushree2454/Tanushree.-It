import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     Palindrom(n);
    }
    public static void Palindrom(int n ){
        int temp = n ;
        int r , rev =0 ; 
        while(n!=0){
         r = n%10;
         rev= rev*10+r;
         n=n/10;
        }
        if(rev==temp)
        System.out.println("is a palindrome");
        else
        System.out.println("is not a palindrome ");
    }
}