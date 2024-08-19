package Access;

public class ObjectDemo {
    int num;
  //  int val;
       float gpa ; 
    //already covered these 2 
    public ObjectDemo(int num, float gpa){
        this.num = num ;
      //  this.val=78;
       this.gpa = gpa; 
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }//gets called when the garbage collection hits 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }//gives the string representation


    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
       //return num ;
    }//unique number representation of an object

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
       // return super.equals(obj);
       return this.num == ((ObjectDemo)obj).num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    
    public static void main(String[] args){
        ObjectDemo obj = new ObjectDemo(14, 58.8f);
        ObjectDemo obj2 = new ObjectDemo(14,78.9f);
        //ObjectDemo obj2 = new ObjectDemo(34);
       // ObjectDemo obj2 = obj;

         if(obj==obj2){
      
            System.out.println("obj1 is equl to obj 2");
          }
          if(obj.equals(obj2)){
          System.out.println("obj1 is equl to obj 2");
        }

System.out.println(obj.getClass());
System.out.println(obj.getClass().getName());
        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());
    }

}
