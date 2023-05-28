public class Pattern {
    public static void main(String[] args)
    {
        int loopCount =1;
        for(int i =1;i<=5;i++)
        {
            for(int j =1; j<=5-i; j++)
                System.out.print(" ");
            for(int k =1; k <= (loopCount*2)-1;k++)
            {
                if(loopCount<=5)
                {
                    if(k%2==0)
                        System.out.print(" ");
                    
                    else    
                        System.out.print("*");
                }    
                else 
                    break;
            }
            for(int j =1; j<=5-i; j++)
                System.out.print(" ");
            System.out.println();
            loopCount++;
        }        
    }
}
