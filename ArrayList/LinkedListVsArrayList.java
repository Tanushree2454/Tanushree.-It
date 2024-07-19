import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
       //both of theri  syntax is prettymuch the same
       //both are a part of the collection framework in java
       //but their behind the scene is quite different

    //LinkedList=>
    //More efficient while adding or deleting an element from a specific location
    LinkedList<String> namesLinkedList = new LinkedList<>();
    namesLinkedList.add("John");
    namesLinkedList.add("Paul");
    namesLinkedList.add("Ross");
    namesLinkedList.add("Jess");
    System.out.println(namesLinkedList.get(2));//less efficient
    namesLinkedList.add(1,"Jerry");//more efficient
    
    //ArrayList=>
    //More efficient in getting / searching an element (faster)
    ArrayList<String> namesArrayList = new ArrayList<>();
   namesArrayList .add("John");
    namesArrayList.add("Paul");
    namesArrayList.add("Ross");
    namesArrayList.add("Jess");
    System.out.println(namesArrayList.get(2));//more efficient
    namesArrayList.add(1,"Jerry");//less efficent
    
    }
}
