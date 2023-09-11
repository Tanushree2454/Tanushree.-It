import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =sc.nextInt();
        int count =0;
        
        while(n!=0){
            int r = n%10;   
        if(r==x)
        count++;
n/=10;
        }
    System.out.println(count);
    }
}
