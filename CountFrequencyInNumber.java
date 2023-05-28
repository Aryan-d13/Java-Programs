import java.util.*;
public class CountFrequencyInNumber {
   
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int num;
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        int[] count = new int[10];
        int i=0;
        while(num !=0)
        {
            i = num%10;
            ++count[i];
            num /= 10;
        }
        for(int j = 0; j<10;j++)
        {
            if(count[j] !=0)
                System.out.println(j + " : " + count[j]);
        }   
    }
    
}
