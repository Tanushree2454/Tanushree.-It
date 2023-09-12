import java.util.Scanner;
public class PrimeNos{
    
        public static void main(String[] args) 
        {
            Scanner scn= new Scanner(System.in);
            System.out.println("Enter any two numbers: ");
            int n1= scn.nextInt();
            int n2= scn.nextInt();

         for(int i = n1;i<=n2;i++){
            if(Prime(i)==true)
            System.out.println(i);
         }
         }
        
         static boolean Prime(int n){
            for(int i = 2 ;i <n ;i++){
                if(n%i==0){
                    return  false;
                }
            }
                return true; 
        }
        // for(int i= beg; i<= end; i++) {
        //     boolean prime = true;  //start by assuming the current number is prime
        //     for(int j=2; j<i; j++) { // Loop till j < i
        //         if(i%j == 0) {
        //           prime = false; //Set the current number as not prime if it is divisible by any number lesser than it
        //         }
        //    }
        //    if (prime) {
        //        res += i+ " ";   //Add to result
        //    }}
        
        }
    
