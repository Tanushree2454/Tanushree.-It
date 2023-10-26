import java.util.Scanner;
public class Thirteen {

 public static void main(String[] args) {
    int n =4; 
    int px=n,py=n;
  for(int i =0 ;i<n ;i++ ){
    for(int j =0;j<2*n;j++){
      if(j==px||j==py)
      System.out.print("*");
      else
      System.out.print(" ");
    }
    px++;
    py--;
    System.out.println();
  }
  for(int i = 0 ;i<=n*2;i++)
  System.out.print("*");
 }
}
    

