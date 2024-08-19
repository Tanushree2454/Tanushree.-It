public class Human {
    int age ;
    String name;
    int salary;
    boolean married;
    //When ever using static variable , declaring , modifieng etc 
    //Use it with convection not the object
    //static variable are not dependent on objects
    static long population;
// population is a critaria tht is common to all human beings therefore it is declared as static
   
static void message(){
    System.out.println("Hello World");
//System.out.println(this.age);//you cannot yse this keyword inside static method

}

public Human(int age, String name, int salary, boolean married){
        this.age =age;
        this.name = name;
        this.salary =salary;
        this.married = married;
        //this.population+=1;//wrong way 
        Human.population+=1;//Right way
//calling a static method
this.message();//wrong way
Human.message();//ringht way
    }
}
