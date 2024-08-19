
public class WrapperExample {
    public static void main(String[] args) {
        //primitive datatype
        int a = 10 ;
        int b = 20 ;
         swap(a, b);
         System.out.println(a+" "+b);// this will not swap

         Integer c = 10 ;
        Integer d = 20 ;
        swap(c, d);
        System.out.println(c+" "+d);//this will also not swap ,because it is final


       // Integer num = new Integer(45);
       //or
       //Object
       Integer num = 45;
       //num.       //you can to various operations easily with this object
    //   System.out.println(num.compareTo(a));
    //   System.out.println(num.intValue());

    // final keyword
     final int bonus = 2 ;
     // bonus = 3 ; // final keyword cannot be changed

     final A kunal = new A("Kunal Kushwaha");
     kunal.name = "other name";//you can change the value
     //when a non primitive is final , you cannot reassign it .
    // kunal = new A("new object");
 A obj = new A("Hey ");
 System.out.println(obj);
//  for( int i = 0 ; i< 10 ;i ++){
//     obj = new A("Random name");
//  }

    }
    static void swap(int a , int b){
        int temp = a; 
        a = b; 
        b = temp;
    }

   


}


class A {
     //final int a ; always initialise a final variable
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Object is destroyed");
    // }
}
