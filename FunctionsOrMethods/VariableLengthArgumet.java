import java.util.Arrays;

public class VariableLengthArgumet {
    public static void main(String[] args) {
       fun(1,2,3,4,5,6,6,7);
       multiple( 2,3, "Kunal", "Rahul", "dvytsbhusc");
       demo("hi","its ","me","!");
       myMethod( 1, "lili","hili");
       test();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void myMethod(int i, String... args) {
       System.out.println(Arrays.toString(args)+i);
    }
    static void test(int ... vargs) {
        // method body
      }
        
      static void test(int n, int ... vargs) {
     System.out.println(Arrays.toString(vargs));
      }
    static void multiple(int a, int b, String ...v) {
        System.out.println(a +","+ b +Arrays.toString(v));
        System.out.println("Number of arguments are: " + v.length);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
        System.out.println("Number of arguments are: " + v.length);
    }
}