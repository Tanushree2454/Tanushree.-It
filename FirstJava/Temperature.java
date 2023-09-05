import java.util.Scanner;
public class Temperature{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float celcius =sc.nextFloat();
    float faranite = (celcius*9/5)+32;
    System.out.println(faranite);
    }
}