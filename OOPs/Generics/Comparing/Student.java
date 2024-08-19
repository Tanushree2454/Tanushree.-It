package Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollno ;
    float marks;
    public Student(int rollno ,float marks) {
        this.rollno = rollno;
        this.marks= marks;
    }

  @Override
  public String toString() {
      // TODO Auto-generated method stub
     // return rollno+"";
      return marks+"";
  }

  public int compareTo(Student o){
  //System.out.println("in compare to method");
    int diff = (int)(this.marks - o.marks);
   // if diff == 0;means both are equal
   //if dif <1 : it means  o is bigger else o is smaller
   return diff;
  

}
}
