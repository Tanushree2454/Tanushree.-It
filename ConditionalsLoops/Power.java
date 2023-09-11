import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'y' to enter the number and the power enter 'n' to exit ");
        char ch;
        while((ch=sc.next().charAt(0))=='y'){
         int num = sc.nextInt();
         int pow = sc.nextInt();
System.out.println(Math.pow(num,pow));
        }
    }
}
