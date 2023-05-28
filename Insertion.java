import java.util.*;
public class Insertion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        int sizeOfArr = sc.nextInt();
        int arr[] = new int[sizeOfArr];
        for(int i = 0;i<sizeOfArr;i++)
        {
            System.out.print("Enter Element at index "+i+" :");
            arr[i]= sc.nextInt();
            System.out.println();
        }
        for(int i = 0;i<sizeOfArr;i++)
        {
            System.out.println("Element at index "+i+" : " + arr[i]);
        }
        System.out.println("Enter The Element You Want To Insert in the Array");
        int element = sc.nextInt();
        System.out.println("Enter The Index You Want To The Array to be inserted : ");
        int index = sc.nextInt();
        int newArr[] = new int[sizeOfArr+1];
        for(int i = 0; i<(sizeOfArr+1);)
        {
            while(i<index)
            {
                newArr[i] = arr[i];
                i++;
            }
            if(index == i)
            {
                newArr[i] = element;
                i++;
            }
            else if(i>index)
            {
                newArr[i] = arr[i-1];
                i++;
            }
        }
        for(int i = 0;(i<sizeOfArr+1);i++)
        {
            System.out.println("Element at index "+i+" : " + newArr[i]);
        }
    }    
}
