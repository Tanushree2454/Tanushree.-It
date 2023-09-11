import java.util.Scanner;
public class CharCheck {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if (Character.isUpperCase(ch)) {
        System.out.println("Character is in Uppercase!");
     }else {
        System.out.println("Character is in Lowercase!");
     }
     //Alternate Method
     if(ch>='a'&&ch<='z')
     System.out.println("Lowercase");
     else
     System.out.println("uppercase");
   } 
}
