import Access.A;
public class Singleton {
    //you can only create one object in this class
    // make a constructor that is private
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
             instance = new Singleton();
        }
        return instance;
    }
    
    A a = new A(10, "kunal");
    //a.getNum(); // not working 
    int num = a.getNum();  // This will work fine
   // int n =  a.num;// now that num is public you can access it from anywhere

   
}
