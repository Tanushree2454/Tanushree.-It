import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      String ans =OddOrEven(n);
      System.out.println(ans);
    }

    public static String OddOrEven(int n){
        if(n%2!=0)
        return "Is Odd";
        else
        return "Is Even";
    }
   
}