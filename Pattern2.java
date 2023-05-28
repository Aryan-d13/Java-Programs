import java.util.*;
public class Pattern2 
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Number Of Columns : ");
        int columns = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j =1;j<=columns;j++)
            {
                if(i ==1 || i== rows)
                    System.out.print("*");
                else
                {
                    if(j==1||j== columns)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
