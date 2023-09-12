import java.util.Scanner;
public class SumOf1stN{
    public static void main(String args[]){
Scanner sc  =  new Scanner(System.in);
int n = sc.nextInt();
int ans = sum(n);
System.out.println(ans);
    }
    public static int  sum(int n){
        int sum = 0 ;
        for(int i= 0 ; i<=n;i++)
        sum+=i;
   return sum;

    }
}