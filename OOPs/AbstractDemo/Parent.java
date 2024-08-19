package AbstractDemo;
//if the class contains one or more than 1 abstract method the class also needs to be declared as abstract
public abstract class Parent {
//abstract methods need to be overridden
//static methods cannot be overridden
//thus you cannot create abstract static method
//but you can create static methods in abstract classes

static void hello(){
    System.out.println("hey");
}
void normal(){
    System.out.println("This is a normal method ");
}
  static  int age;
  // int age;
    final int VALUE;
    public Parent(int age){
        this.age = age ;
        VALUE  =324556;
    }

    //abstract Parent();//you cannot create abstract constructor
    abstract void career();
    abstract void partner();
}
