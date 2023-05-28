import java.util.*;
public class ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Number Of Elements In The Array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Enter "+i+"th"+" Element : ");
            arr[i] = sc.nextInt();
        }
        int newArr[] = new int[num];
        int j = arr.length-1;
        System.out.println("J : "+j);
        for(int i = 0; i<arr.length; i++)
        {
            newArr[i] = arr[j];
            j--;
        }
        
        System.out.println("Array:");
        printArr(arr);

        System.out.println("Reversed Array : ");
        printArr(newArr);

    }
    static void printArr(int[] arr)
    {
        for(int i =0; i<arr.length;i++)
            System.out.print(+arr[i]+",");
        System.out.println();
    }
}
