import java.util.ArrayList;
import java.util.Collections;
/*Arrays=
  m/m continuous 
  fixed size
  stored in stack
  can hold both primitives(int,float,boolean etc) and objects

  ArrayList=
  m/m non-continuous
  variable size
  stored in heap 
  can only hold objects 
  (hence, instead of using a primitive like int use its wrapper class-<Integer>,capital L for long , capital B for boolean ,etc )
  .add
  .get
  .modify
  .delete/remove
  .Iterate/Operation
 */
public class Example{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(5);
    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    //list.add(index,Integer element);
    //.add()-only adds an element to the list without changing any element;
    list.add(2,3);
    System.out.println(list);
    //.set(index,element)-it changes the element at the indecated index; 
    list.set(0,0);
    System.out.println(list);
    //delete element list.remove(index)
    list.remove(4);
    System.out.println(list);
    int size = list.size();
    System.out.println(size);
    //loop
    for(int i =0;i<list.size();i++){
      System.out.print(list.get(i));
    }
    System.out.println();
     list.add(0,5);
     System.out.println(list);
    //Sorting
    Collections.sort(list);
    System.out.println(list);
    list.remove(Integer.valueOf(4));
    System.out.println(list.indexOf(3));
    System.out.println(list.lastIndexOf(1));
    System.out.println(list);
  }

}

