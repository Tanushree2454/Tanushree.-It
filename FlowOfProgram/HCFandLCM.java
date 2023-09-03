import java.util.Scanner;

public class HCFandLCM {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter 2  numbers");
       
         int a =sc.nextInt(); 
         int b =sc.nextInt();
        
         int x=a,y=b;

         //int x;
         while(b!=0){
           int t=b;
            b=a%b;
            a=t;
         }
          int hcf =a;
         int lcm =x*y/hcf;
         System.out.println("hcf="+a);
         System.out.println("lcm="+lcm);
}
}