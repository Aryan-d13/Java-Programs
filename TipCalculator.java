import java.text.DecimalFormat;
import java.util.*;
public class TipCalculator 
{
    public static void main(String[] args)
    {
        DecimalFormat ft = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator.");
        System.out.println("What was the total bill? ");
        float bill = sc.nextFloat();
        System.out.println("What Percentage tip would you like to give?");
        float tipPercentage = sc.nextFloat();
        System.out.println("How many people to split the bill?");
        int people = sc.nextInt();
        float toatalBillWithTip = bill + ((tipPercentage/100)*bill);
        System.out.println("Total Bill including tip : "+ toatalBillWithTip);
        System.out.println("Each person should pay : "+ ft.format(toatalBillWithTip/people));
    }
}
