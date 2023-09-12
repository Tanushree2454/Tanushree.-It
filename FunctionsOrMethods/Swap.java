public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b); //this will not swap the value of a and b
       

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

       static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
        System.out.println(num1 + " " + num2);
    }

}
/*
import java.util.Arrays;

public class ChangeValue{
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }
}
*/