import java.util.*;
class Fibonacci
{
    public static void main(String []args)
    {
      int i =1 ;
      int a = 0;
      int b = 1;
      int c = 0;
      System.out.println(a +"\n" + b);
      do{
          c= a+b;
        a=b;
        b=c;
      System.out.println(c);
      i++;
    }while ( i<=10) ;

    

  }
}
