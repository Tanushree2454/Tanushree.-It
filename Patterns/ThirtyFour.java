public class ThirtyFour{
    public static void main(String[] args) {
        char letter = 'a'; // Starting letter

        int n = 5; // Change the value of 'n' to adjust the number of rows
 int count =1;
        for (int i = 0; i < n; i++) {
        

            // Print letters in ascending order
            for (int j = 0; j <= i; j++) {
                if(count%2!=0)
                System.out.print( letter);
                else
                System.out.print(Character.toUpperCase(letter));
                letter++;
                count ++;
            }

            System.out.println(); // Move to the next line
        }
    }

    private static char[] toUppercase(char letter) {
        return null;
    }
}
