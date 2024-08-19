package Interfaces.extendDemo2;

public class Main implements A,B {

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }

    public static void main(String[] args){
        Main obj = new Main();
        A.greeting();
    }
    // @Override
    // public void fun() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'fun'");
    // }
    
}
