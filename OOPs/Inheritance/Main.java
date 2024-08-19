package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(4);
        Box box2 = new Box(4,2,3);
        Box box3 = new Box(box2);
        System.out.println(box.l+" "+box.w+" "+box.h);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        System.out.println(box3.l+" "+box3.w+" "+box3.h);

        BoxWeight box4  = new BoxWeight();
        BoxWeight box5  = new BoxWeight(4,3);
        BoxWeight box6  = new BoxWeight(4,2,3,3);
        BoxWeight box7  = new BoxWeight(box6,3);

        System.out.println(box4.h+" "+box4.weight);
  System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight);
        System.out.println(box6.l+" "+box6.w+" "+box6.h+" "+box6.weight);
        System.out.println(box7.l+" "+box7.w+" "+box7.h+" "+box7.weight);
        
        //The type of the refrence variable and not the type of the objects that determins what members can be accessed
//reference variable      //object               
        Box box8 = new BoxWeight(2,3,4,5);
        System.out.println(box8.w);
       // System.out.println(box8.weight);//This cannot be accesed 

       BoxWeight box10  = new BoxWeight(box6);
       System.out.println(box10.h+" "+box10.l+" "+box10.w+" "+box10.weight);
       /*
       there are may variables in both parent and child class
        you are given access to variables that are in the ref type i.e. BoxWetight
        hence , you should have access to weight vaiable
        this also means, that the ones you are trying to access should be initialised
        but here, when the object itself is of type parent class, how will you call the constructor
        that is why error

       BoxWeight box9 = new Box(1,2,3);//you cannot have a child reference variable and a parent object
       System.out.println(box9);
        */


        BoxPrice boxpr = new BoxPrice(5,8,200);
        System.out.println(boxpr.cost);

     
        box.greeting();
        box10.greeting();
//static method cant be overwritten
        Box boxor = new BoxWeight();
        boxor.greeting();
    }
}
