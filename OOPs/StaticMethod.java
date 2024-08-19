public class StaticMethod {
    public static void main(String[] args) {
//greeting();
    Main funn = new Main();
    funn.fun2();
     
    }
    static void fun(){
      //  greeting();//you can not access a non static method inside a staic one
        //it depends on instance
        // but  the function you are using it in does not depend on instances
 
  //you cannot access non static stuff without referencing their instances in a static context
  // hence, here i am referencing it 
  Main obj = new Main();
  obj.greeting();
  
    }
//you can call a non static method insinde a non static method
    void fun2(){
        greeting();
    }
//we know that something which is non static belongs to an object
    void greeting(){
        fun();//you can access a static method inside a non static method
System.out.println("Hello world");
    }
}
