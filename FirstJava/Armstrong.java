import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
              int input_1, input_2, check, rem, sum, i;
              Scanner my_scanner = new Scanner(System.in);
              System.out.println("Enter the first number :");
              input_1 = my_scanner.nextInt();
              System.out.println("Enter the limit :");
              input_2 = my_scanner.nextInt();
              System.out.println("The Armstorm numbers are :");
              for (i = input_1; i<input_2; i++){
                 sum = 0;
                 check = i;
                 while(check != 0) {
                    rem = check % 10;
                    sum = sum + (rem * rem * rem);
                    check = check / 10;
                 }
                 if(sum == i){
                    System.out.println(i);
                 }
              }
           }
        }
    