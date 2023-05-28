import java.util.*;
class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double num = sc.nextInt();
        System.out.println("Enter Number: ");
        double num2 = sc.nextInt();
        System.out.println("Enter Number: ");
        double num3 = sc.nextInt();

        double avg = (num+num2+num3)/3.0;
        System.out.println("Average : "+avg);
        sc.close();
    }
}