public class Fourteen {
    public static void main(String[] args) {
         int n =4 ; 
        for(int i=0;i<=n*2;i++)
        System.out.print("*");
       System.out.println();
        int fs =1,ls = n*2-1;
         for(int i = 0 ;i<n ;i++){
            for(int j = 0 ;j<=n*2-1;j++){
                if(j==fs||j==ls)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            fs++;
            ls--;
System.out.println();
         }
    }
}
