import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class MethodOverloading {
    static void avg(int num1, int num2, int num3)
    {
        System.out.println("In Int Method : "+ (num1+num2+num3)/3);
    }
    static void avg(double num1, double num2, double num3)
    {
        System.out.println("In Double Method : "+ (num1+num2+num3)/3);
    }
    public static void main(String[] sre)
    {
        //avg(5,7,8);
        avg(5.0,7.0,8.0);
    }
}
