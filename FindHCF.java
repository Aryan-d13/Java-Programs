import java.util.*;
public class FindHCF {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers To Print Their HCF(Highest Common Factor)");
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        int hCF = 0;
        int lower = (num1<num2? num1:num2);
        System.out.println(lower);
        for(int i = lower;i>0;i--)
            if(num2%i == 0 && num1%i == 0)
            {
                hCF = i;
                break;
            }
        System.out.println("HCF of given number is : "+hCF);
    }
}
