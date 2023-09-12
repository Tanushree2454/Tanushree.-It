import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 numbers : ");
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
           int min= Min(n,a,b);
          int max=  Max(n,a,b);
          System.out.println("minimum = "+min);   
          System.out.println("maximum = "+max);

    }
    public static int Min(int n,int a ,int b){
     return Math.min(Math.min(n, a),b);          
    }
    public static int Max(int n,int a ,int b){
       return Math.max(Math.max(n, a), b);       
    }

}