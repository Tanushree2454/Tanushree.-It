public class ThirtySix {
  public static void main(String[] args) {
    int n = 4; // Change the value of 'n' to adjust the number of rows

        for (int i = 1; i <= n; i++) {
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
  }  
}
