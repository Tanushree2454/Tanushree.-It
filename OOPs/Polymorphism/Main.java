package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        //Shapes circle = new Circle();
        Circles circle = new Circles();
       // Square square = new Square();
        Shapes square = new Square();
        square.area();
        shape.area();
    }
//Dynamic method dispathch 
//runtime polymorphism - during the runtime java decides which one to run
    /*Overriding
     * Upcasting
     * //reference decides which one to access , child decides which one to run
     * Parent obj = new Child();
     * Here , which method will be called depends on Child()
     */
}
