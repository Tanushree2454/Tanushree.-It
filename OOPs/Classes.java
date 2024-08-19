

import java.util.Arrays;

public class Classes{
    //a class is a named group of properties and functions
    //an object is an instance of a class
    //class = logical construct
    //object = physical reality , occupies space in memory
    //objects are stored in heap memory 
    //referance variables are stored in stack memory
    public static void main(String[] args) {
        /*   compile time  ||  run time
        Student[] students = new Student[5];// declaring //new = dynamically allocates memory and returns a reffernce to it
        System.out.println(Arrays.toString(students));
       output = [null, null, null, null, null]
        */
//                          Student() - constructor
        Student kunal = new Student();

        kunal.rollno=14;
        kunal.name ="kunal kushwaha";
       // kunal.marks=88.5f;

        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

    }
}
    class Student{
        int rollno ; 
        String name ; 
        float marks = 90;
    }
