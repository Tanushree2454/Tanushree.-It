import java.util.Scanner;

public class Twenty {
 public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");
       int out,in;
       int row_size=cs.nextInt();
       for(out=1;out<=row_size;out++)
       {
           for(in=1;in<=row_size;in++)
           {
               if((in==1 || in==row_size)||(out==1 || out==row_size))
               {
                  System.out.printf("*");
               }
               else
               {
                System.out.printf(" ");    
               }
           }
           System.out.println(); 
       }
       cs.close();
	}
    
}
