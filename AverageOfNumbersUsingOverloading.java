import java.io.*;
public class AverageOfNumbersUsingOverloading {
    public static void main(String[] eags) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        System.out.println("Enter Number One Integer: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter Number Two Integer: ");
        int num2 = Integer.parseInt(br.readLine());

        calcAverage(num, num2);

        System.out.println("Enter Number One Double: ");
        double num3 = Double.parseDouble(br.readLine());

        System.out.println("Enter Number Two Double: ");
        double num4 = Double.parseDouble(br.readLine());
        calcAverage(num3, num4);
    }
    static void calcAverage(int num1, int num2){
        System.out.println("In Method Int :");
        System.out.println("Average : "+(num1+num2)/2);
    }
    static void calcAverage(double num1, double num2){
        System.out.println("In Method Float :");
        System.out.println("Average : "+(num1+num2)/2);
    }
}