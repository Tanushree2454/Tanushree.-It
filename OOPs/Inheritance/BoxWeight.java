package Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l, double h , double w , double weight){
       
        super(l,h, w);//parent class construnctor

        System.out.println(this.weight);
       // System.out.println(super.weight);// in case the parent class also has a super keyword

        this.weight=weight;
      //  super(l,h, w);//you cannot write about a parameter of the child class first hence error
      
    }
    public BoxWeight(double side ,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(Box old,double weight){
        super(old);
        this.weight=weight;
    }
    //@Override//cannot be overwritten//you can inherit but you cannot override 
    static void greeting(){
        System.out.println("Hey , I am in BoxWeight class. Greetings!");
     }
}
