//static public class InnerClass{
//outside classes cannot be static because it is itself not dependent on any other class
/* 
class Test{//This is wrong 
    static String name;
    public Test(String name){
        Test.name = name;
    }// This will give the output shey shey
}
*/

import java.util.Arrays;

public class InnerClass{
   static class Test{
    // String name;
     //or
     static String name;
        public Test(String name){
           // this.name = name;
           //or
           Test.name = name;
        }
        /*
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return name;
        }
            */
    }
 
    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("shey");

      System.out.println(Arrays.toString(new int[]{3,4,5}));
       System.out.println(a);
       System.out.println(a);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A{
//}