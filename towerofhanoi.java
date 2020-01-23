import java.util.*;
import java.lang.*;
public class towerofhanoi {
    static String a,b,c;
  void tower(int no,String from,String via,String to)
  {
      if(no==1)
      {
          System.out.println(from+"--"+to);
          return;
      }
          tower(no - 1, from,to,via);
          System.out.println(from+"--"+to);
          tower(no-1,to,from,via);
  }
  public static void main(String [] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the valaue of n up to you want to chack...");
      int n = sc.nextInt();
      System.out.println("The steps for the following tower are given below");
      towerofhanoi obj = new towerofhanoi();
      obj.tower(n,"L","M","R");
      int a= Math.pow(2,n);
      int b= a-1;
      System.out.print("The total number of steps are "+b);
  }

}
