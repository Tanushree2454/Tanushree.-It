package Polymorphism;

public class Circles extends Shapes {
    //this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override//this is called annotation
    void area(){
        System.out.println("Area is pi * r * r");
    }
    //overriding means a method is exactly the same in parenat class as it is in the child class
    //if overriding dosent occur then @Override , will give an error
    
}
