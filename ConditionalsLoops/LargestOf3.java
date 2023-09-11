import java.util.Scanner;
public class LargestOf3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(Math.max(Math.max(a, b),c));
        /*
        int max = a; 
        if(b>max)
        max=b;
        if(c>max)
        max =c;
        System.out.println(max);
        */
//Alaternate Method
        /*
        int max =0;
        if(a>b)
        max = a; 
        else
        max =b;
        if(c>max)
        max=c;
        System.out.println(max);
        */
      if(a>b&&b>c)
      System.out.println(a);
      else if(b>a&&a>c)
      System.out.println(b);
      else
      System.out.println(c);
    }
}