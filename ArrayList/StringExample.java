import java.util.ArrayList;
import java.util.Arrays;
public class StringExample {
    public static void main(String[] args) {
     /* one way of declaring an array
     // declare an array
int[] age = new int[5];

// initialize array
age[0] = 12;
age[1] = 4;
age[2] = 5;*/ 

      //  String[] friendsArray = new String[4];
      String[]   friendsArray={"John","Chris","Eric","Luke"};
     //ArrayList<String> friendArrayList1=new ArrayList<>();
     ArrayList<String> friendArrayList=new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke"));

     //Arrays VS ArrayList
     //Get element
     System.out.println(friendsArray[1]);
     System.out.println(friendArrayList.get(1));
     //Get size
     System.out.println(friendsArray.length);
     System.out.println(friendArrayList.size());
     //Add an element
     //You cant do that with arrays;
     friendArrayList.add("Mitch");
     System.out.println(friendArrayList.get(4));
     //set an element
     friendsArray[0]="Carl";
     System.out.println(friendsArray[0]);
     friendArrayList.set(0,"Carl");
     System.out.println(friendArrayList.get(0));
     //Remove an element 
     //cant do this with arrays;
     friendArrayList.remove("Chris");//removing by object
     System.out.println(friendArrayList.get(1));
     System.out.println(friendArrayList);
     friendArrayList.remove(1);//removing by index
    //
    System.out.println(friendsArray);//this is not much usefull
    System.out.println(friendArrayList);
    }
}
