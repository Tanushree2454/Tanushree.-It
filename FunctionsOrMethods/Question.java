import java.util.Scanner;
public class Question{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    boolean ans = Prime(n);
    System.out.println("is prime "+ans);
    for (int i = 100; i < 1000; i++) {
        if (isArmstrong(i)) {
            System.out.print(i + " ");
        }
    }
}

// print all the 3 digits armstrong numbers
static boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;

    while (n > 0) {
        int rem = n % 10;
        n = n / 10;
        sum = sum + rem*rem*rem;
    }

    return sum == original;

    }

   static boolean Prime(int n){
        for(int i = 2 ;i <n ;i++){
            if(n%i==0){
                return  false;
            }   
            
        }
     
       return true; 
    }

}