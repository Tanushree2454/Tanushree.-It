import java.util.Scanner;

public class LargestNumberOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  , max =0;
        while((n=sc.nextInt())!=0){
         if (n>max)
         max =n;
        }
        System.out.println("The maximum number is "+max);
    }
}
