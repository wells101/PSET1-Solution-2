package mario;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        StringBuilder myBuilder = new StringBuilder();
        int height;
        do
        { 
           System.out.println("Enter Height of Pyramid: ");
            height = inputScanner.nextInt();
        }while(height >23 || height < 0);
        //start printing the pyramid
        //start with the first row. Number Spaces is (height - 1) - (row + 2)
        // Cont.  Number Hashes is (row + 2)
        //establish the first line in Stringbuilder.  There should be Height-2 Spaces, and 2 hashes
        for(int spaces = 0; spaces <= height-2; spaces++)
        {
            myBuilder.append(' ');
        }
        myBuilder.append("##");
        //Print the first line
        System.out.println(myBuilder.toString());
        while(myBuilder.lastIndexOf(" ") >= 0)
        {
            myBuilder.setCharAt(myBuilder.lastIndexOf(" "), '#');
            System.out.println(myBuilder.toString());
        }
            //replace the last space with a hash.
            //print the next line.
        
    }
    
}
