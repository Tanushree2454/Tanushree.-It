package Inheritance;

public class Box {
    // anything that is private can only be accessed in that particular file only and no where else
  //  private double l ;//used for encapsulation 
 double l ;
  double h ;
  double w ;
 // double weight;

 
/*ENCAPSULATION
public double getL(){
    return l;
} */


//cannot override static method
 static void greeting(){
    System.out.println("Hey , I am in Box class. Greetings!");
 }
  Box(){
    super();// no error because object class 
    // super points towards whats directly above it 
    this.h = -1;
    this.l = -1;
    this.w = -1;
  }
  Box(double side){
    this.h = side;
    this.l = side;
    this.w = side;
  }
  Box(double l , double h ,double w){
System.out.println("Box class constructor");
    this.h = h;
    this.l = l;
    this.w = w;
  }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
      }

      public void information(){
        System.out.println("Running the box");
      }
  }
