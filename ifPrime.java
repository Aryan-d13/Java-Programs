import java.util.*;
public class ifPrime {
    public static void main(String[] args)
    {
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Positive Number : ");
        int num = sc.nextInt();

        for(int i =2;i<num;i++)
            if(num%i == 0)
            {
                isPrime = false;
                break;
            }        
        if(isPrime)
            System.out.println("Numeber is Prime");
        else 
            System.out.println("Number is Not Prime");
    }
}
