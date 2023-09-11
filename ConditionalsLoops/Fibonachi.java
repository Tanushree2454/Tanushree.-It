import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int start = 0 ; int second = 1;
        System.out.println(start+"\n"+second);
       //int  count=2;
       int next=0;
        for(int i=2;i<=n;i++){
            next = start +second ;
            start =second;
            second =next;
            System.out.println(next+" ");
        }

    }
}
