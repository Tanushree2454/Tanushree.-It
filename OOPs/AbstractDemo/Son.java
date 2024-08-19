package AbstractDemo;

public class Son extends Parent{

    // public Son(int age){//without parent constructor
    //     this.age=age;
    // }
@Override
void normal(){
    super.normal();
}
    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a doctor ");
    }

    @Override
    void partner() {
        System.out.println("I love ironman");
     }
    
}
