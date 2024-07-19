
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        
    ArrayList<Integer> l1= new ArrayList<>();
    ArrayList<Integer> l2= new ArrayList<>(5); 
l1.add(1);
l1.add(6);
l1.add(7);
l1.add(4);
l1.add(6);
l1.add(0,4);
l1.add(1,6);

for(int i=0 ;i<l1.size();i++){
    System.out.print(l1.get(i)+" ");
}
System.out.println(l1);
l2.add(12);
l2.add(15);
l2.add(18);
l2.add(12);
l2.add(15);
l2.add(18);
l1.addAll(l2);
System.out.println(l2+"l2");
l2.clear();
System.out.println(l2+"l2");
System.out.println(l1.contains(12));//true
System.out.println(l1.contains(l2));//false
System.out.println(l1);
System.out.println(l1.indexOf(6));
System.out.println(l1.lastIndexOf(6));
l1.addAll(1,l2);
for(int i=0 ;i<l1.size();i++){
    System.out.print(l1.get(i)+" ");
}
}

}