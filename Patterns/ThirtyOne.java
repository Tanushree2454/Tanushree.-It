public class ThirtyOne{
    public static void main(String[] args) {
        int n = 4; // Change the value of 'n' to adjust the number of rows

        for (int i = 1; i <= 2 * n - 1; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }

            // Print numbers in descending order
            for (int j = n; j >= i; j--) {
                System.out.printf("%2d  ", j);
            }
            // Print numbers in ascending order
            for (int j = i + 1; j <= n; j++) {
                System.out.printf("%2d  ", j);
            }

            System.out.println(); // Move to the next line
        }
    }
}


