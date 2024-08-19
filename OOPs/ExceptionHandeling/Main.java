package ExceptionHandeling;

public class Main {
    public static void main(String[] args) {
        int a = 5; 
        int b = 0 ; 
        try{
          //  int c = a/b;
         // divide(a,b);
          //mimicing
         // throw new Exception("Just for fun");
        
        String name = "Kunal";
        if (name.equals("Kunal")) {
            throw new MyException("name is kunal");
        }
    }
    catch (MyException e) {
        System.out.println(e.getMessage());
    }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Normal exception");
        }
        finally{
            System.out.println(
                "This will always execute"
            );
        }
//arithmetic exception is a subclass of exception
        try{
            int c = a/b;

        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }

    // static int divide(int a , int b){
    //     return a/b;
    // }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do no divide by zero");
        }

        return  a / b;
    }
}
