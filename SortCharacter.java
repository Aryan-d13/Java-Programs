import java.util.*;
public class ChiragBhoomi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String lowStr = str.toLowerCase();
        char arr[] = lowStr.toCharArray();
        String newChar[];
        char letterarr[]  = new char[arr.length]; 
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)   
            if(arr[j]<arr[i])
            {
                
                swapChar(i,j,arr);

            }
                      
            
        }
        System.out.println("Sorted Array is : " + String.valueOf(arr));
    }
    public static void swapChar(int i, int j, char[] arr)
    {
        char u = arr[i];
        arr[i] = arr[j];
        arr[j] = u;
    }
}
