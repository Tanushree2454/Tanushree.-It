package Access;

public class A {
 //  private int num ; 
// public int num ;
//protected int num ;
   protected int num;
    String name; 
    int[] arr;

public int getNum(){
    return num ;
}
public void setNum(int num){
    this.num = num;
}

   // public A(int num , String name ,int[] arr){
    public A(int num , String name ){
        this.num = num;
        this.name = name;
       // this.arr = arr;
       this.arr = new int[34];
    }
}
