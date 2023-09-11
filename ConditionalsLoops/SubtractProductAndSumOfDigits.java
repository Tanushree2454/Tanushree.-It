import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int prd =1 , sum =0 ;
      while(n!=0){
        int r = n%10;
        prd*=r;
        sum+=r;
        n/=10;
      }
      System.out.println(prd-sum);
    }
}
