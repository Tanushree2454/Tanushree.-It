
public class ThirtyThree {
    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
        

            // Print letters in descending order
            for (char letter = (char)('E' - i); letter <= 'E'; letter++) {
                System.out.print(" " + letter);
            }

            System.out.println(); // Move to the next line
        }
    }
}
