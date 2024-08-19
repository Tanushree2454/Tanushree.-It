import javax.swing.text.html.HTMLDocument;

public class Main {
    public static void main(String[] args) {
        Human Kunal = new Human(22,"Tanushree" , 11000, false);
        Human sunal = new Human(32,"Tree" , 11000, true);
        Human dhah = new Human(32,"Tree" , 11000, true);
       
        //System.out.println(Kunal.population);//wrong way 
        System.out.println(Human.population);//right way
        System.out.println(Kunal.name);
        //System.out.println(sunal.population);//wrong way
        System.out.println(Human.population);//right way
        System.out.println(sunal.married);
        System.out.println(Human.population);
        
    }

    public void greeting() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greeting'");
    }

    public void fun2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fun2'");
    }
}
