public class TwentyFive {
    public static void main(String[] args) {
        

    int n=5;
    int i, j; 
   int num = 1; 
    // outer loop to handle number of rows 
    for (i = 1; i <= n; i++) { 
        // inner loop to print spaces 
        for (j = 1; j <= n-i; j++) { 
            System.out.print(" "); 
        } 

        // inner loop to print stars 
        for (j = 1; j <= 5; j++) { 
            if((i==1||i==n)||(j==1||j==n))
            System.out.print("*"); 
          else
            System.out.print(" ");
        } 
        // printing new line for each row 
        System.out.println(); 
    } 
}
}
