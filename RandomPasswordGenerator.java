import java.util.*;
import java.io.*;

import java.io.*;
public class RandomPasswordGenerator {
    public static void main(String[] args) throws FileNotFoundException {

        //File f = new File(Passwords.txt);
        PrintStream o =  new PrintStream(new File("Passwords.txt"));
        String englishCharacterUpper = "ABCDEFGHJKLMNOPQQRSTUVWXYZ";
        String englishCharacterLower = "abcdefghijkglmnopqrstuvwxyz";
        String digits = "1234567890";
        String specialCharacters = "!@#$%^&*";
        for(int j =1; j<=50; j++){
            String generatedPassword = "";
            for (int i = 0; i < 10; i++) {
                if(i<6)
                    if((int)(Math.random()*100) %2 == 0)
                        generatedPassword = generatedPassword + englishCharacterUpper.charAt((int)(Math.random() * 26));
                    else
                        generatedPassword += englishCharacterLower.charAt((int)(Math.random() * 26));
                    else if(i==6)
                    generatedPassword = generatedPassword + specialCharacters.charAt((int)(Math.random() * 8));
                    else
                    generatedPassword += digits.charAt((int)(Math.random() * 10));
            }
            System.out.println(generatedPassword); 
            System.setOut(o); 
        }
    }
}
