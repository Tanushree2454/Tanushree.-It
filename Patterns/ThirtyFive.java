public class ThirtyFive {
    public static void main(String[] args) {
    
    char letter = 'E'; // Starting letter

    int n = 5; // Change the value of 'n' to adjust the number of rows

    for (int i = 0; i < n; i++) {
        // Print leading spaces
        for (int j = 0; j < i; j++) {
          //  System.out.print("   ");
        }

        // Print letters in descending order
        for (int j = 0; j <= n - i - 1; j++) {
            System.out.print(" " + letter);
            letter--;
        }

        System.out.println(); // Move to the next line
        letter = (char)('E' - i - 1); // Reset the letter for the next row
    }     
}
}