package FirstPackage.SubPackage;
import Access.A;
public class SubClass  extends A{

    public SubClass(int num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(45,"Kunal" );
       // A obj = new SubClass(45,"kuanl");
       //A obj = new A(45,"kuanl");// only the subclass in a different package can access a protected integer , not even the same class itself
        int n = obj.num ;
    }


}
class SubClass2 extends A{
    public SubClass2(int num , String name){
        super(num,name);

    
    }
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45,"Kunal" );
       // A obj = new SubClass(45,"kuanl");
       //A obj = new A(45,"kuanl");// only the subclass in a different package can access a protected integer , not even the same class itself
        int n = obj.num ;
    }

}

class SubSubclass extends SubClass{
    public SubSubclass(int num , String name){
        super(num ,name);
    }
    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Kunal");
        int n  = obj.num ;
    }
}