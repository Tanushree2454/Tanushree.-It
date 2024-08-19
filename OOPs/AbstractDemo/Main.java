package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        

    Son son = new Son(22);
    son.career();
   // Daughter daughter = new Daughter(18);
   Parent daughter = new Daughter(28); 
    daughter.career();

    // Parent mom = new Parent();//you cannot create objects of an abstract class
    Parent mom = new Parent(45){

        @Override
        void career() {
        }

        @Override
        void partner() {
             }
        
    };
Parent.hello();
son.normal();
}
}
