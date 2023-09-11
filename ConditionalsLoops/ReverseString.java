import java.util.Scanner;
public class ReverseString{
    public static void main(String args[]){
        System.out.println("Hello world !");
Scanner sc = new Scanner(System.in);
                String  s= sc.nextLine(),c="";
                for( int i = 0 ; i<s.length();i++){
                  char ch =  s.charAt(i);
                 c=ch+c;  
            }
            System.out.println(c);
            }
        }
        
