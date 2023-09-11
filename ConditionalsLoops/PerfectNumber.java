import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
       for(int i =1 ;i <n ;i++){
        if(n%i==0)
        System.out.println(sum+=i);
       }
       if(sum==n)
       System.out.println("perfect number ");
       else 
       System.out.println("Not a perfect number ");
    }
}
