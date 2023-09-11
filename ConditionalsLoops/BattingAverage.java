
import java.util.Scanner;
class BattingAverage
{
  public static void main(String arg[])
 
  {
 
     long Matches,runs,innings,notout;
 
     double avg;
 
     Scanner sc=new Scanner(System.in);
 
     System.out.println("enter the number of matches played");
 
     Matches=sc.nextLong();
 
     while(true)
     {
        System.out.println("enter the number innings batted");
 
        innings=sc.nextLong();
      
        if(innings<=Matches)
        break;
 
        System.out.println("enter the number innings batted correctly <=matches");
 
     }
 
 
    while(true)
    {
 
      System.out.println("enter number of times notout");
 
      notout=sc.nextLong();
    
      if(notout<=innings)
       break;
 
      System.out.println("enter the number times became notout correctly <=innings");
     }
 
     System.out.println("enter runs scored");
 
     runs=sc.nextLong();
 
     if(innings==notout)
     avg=runs;
     else
     avg=runs/(innings-notout);
 
     System.out.println("batting average="+avg);
 
   }
}

// class BattingAverage
// {
//   public static void main(String arg[])
//   {
//      int Matches=5,totalruns=200,innings=5,notout=1;
 
//      double avg;
 
//      avg=totalruns/(innings-notout);
 
//      System.out.println("batting average="+avg);
 
//   }
// }