public class TwentyTwo {
    public static void main(String[] args) {
        int n =5 ;
        int num =1 , count =1 ;
        for(int i=1;i<=5;i++){
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }
    
}
