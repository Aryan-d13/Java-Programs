import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
public class RockPapersSiccors {
    
    public static void main(String[] arhs)throws IOException
    {
        playGame();

    }
    static void calcWinner(String computer, String input)
    {
        String a = computer;
        String b = input;
        if(a.equals(b))       {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("Game Ended In A Draw");
        }
        else if(a.equals("rock") && b.equals( "paper"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("User Wins");
        }
        else if(a.equals( "rock") && b.equals( "scissors"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("Computer Wins");
        }
        else if(a.equals( "paper") && b.equals( "rock"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("Computer Wins");
        }
        else if(a.equals( "scissors") && b.equals( "rock"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("User Wins");
        }
        else if(a.equals( "paper") && b.equals( "scissors"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("User Wins");
        }
        else if(a.equals("scissors") && b.equals( "paper"))
        {
            System.out.println("Computer : " + a);
            System.out.println("User : "+ b);
            System.out.println("Computer Wins");
        }
        else{
            System.out.println("hello hi how are you");
        }
        //return 0;
    }
    public static void playGame()throws IOException
    {
        Random random = new Random();
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Ente Rock/Paper/Scissors : ");
        String input = br.readLine();

        int computerInput = random.nextInt(3);
        String com = "";
        input=input.toLowerCase();
        switch(computerInput)
        {
            case 0:
                com = "rock";
                break;
            case 1:
                com ="scissors";
                break;
            case 2:
                com = "paper";
                break;
        }
        // System.out.println(com);
        // System.out.println(input);
        calcWinner(com,input);

        System.out.println("Do you want to Play again : Y/N");
        String input2 = br.readLine().toLowerCase();

        if(input2.equals( "y"))
            playGame();
    }
}
