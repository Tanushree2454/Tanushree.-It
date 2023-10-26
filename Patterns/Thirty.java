public class Thirty {
int n =5;
public static void main(String[] args) {
    int n = 5; // Change the value of 'n' to adjust the number of rows

    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // Print ascending numbers
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        // Print descending numbers
        for (int j = 2; j <= i; j++) {
            System.out.print( j);
        }

        System.out.println(); // Move to the next line
    }
}


}
