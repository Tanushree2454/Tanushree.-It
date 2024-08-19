public class Constructor {
    public static void main(String[] args) {
        Student kunal = new Student();
        Student rahul = new Student(15,"rahul sing",85.4f);
        kunal.rollno=13;
        kunal.name="Kunal kushwaha";
        kunal.marks=88.5f;
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
     
        kunal.greeting();
       kunal.changeName("Tanushree");
       kunal.greeting();

       System.out.println(rahul.rollno);
       System.out.println(rahul.name);
       System.out.println(rahul.marks);
    
       rahul.greeting();
      rahul.changeName("Tanushree");
      rahul.greeting();

      kunal.changeName2("Tanu");
      kunal.greeting();
    //   Student random = new Student(kunal);
    //   System.out.println(random.name);
      Student random = new Student(rahul);
      System.out.println(random.name);
      Student random2= new Student();
      System.out.println(random2.name);
      Student one = new Student();
      Student two = one;
      one.name="Tanka johari";
      System.out.println(two.name);

    }
}
    class Student {
        int rollno;
        String name;
        float marks = 90 ;

       
     void greeting(){
        System.out.println("Hello , my name is "+this.name);
        System.out.println("Hello , my name is "+name);
     }
     void changeName(String newName){
        name = newName;
     }
     void changeName2(String name){
        this.name = name;
     }
        Student(Student other){
            this.name=other.name;
            this.rollno = other.rollno;
            this.marks=other.marks;
        }
        // Student(){
        //     this.rollno=13;
        //     this.name = "KUnal Kushwaha";
        //     this.marks = 88.5f;
        // }
        Student(){
            //this is how you call a constructor from another constructor
            //internally : new Student(13,"default person", 100.0f)
            this(13,"default person",100.0f);
        }
        Student(int roll , String name , float marks){
            this.rollno = roll;
            this.name = name;
            this.marks = marks;
        }
    }

