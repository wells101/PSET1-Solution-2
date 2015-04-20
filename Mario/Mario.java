package Mario;

import java.util.Scanner;
import OutputStrategy.*;

public class Mario {
    public static void main(String[] args) {
       
        Scanner inputScanner = new Scanner(System.in);
        OutputContext myContext = new OutputContext();
        int height, outputOption;
        
        do {
            System.out.println("Enter Height of Pyramid: ");
            height = inputScanner.nextInt();
        } while (height > 23 || height < 0);
        
        Pyramid myPyramid = Architect.pyramid(height);
        
        do{
            System.out.println("Choose Output. 1: Console 2: File");
            outputOption = inputScanner.nextInt();
        } while (outputOption != 1 && outputOption != 2);
        
        if(outputOption == 1){
            myContext.setStrategy(new OutputConsole());
            myContext.process(myPyramid.toString());
            
        }
        else{
            myContext.setStrategy(new OutputFile());
            myContext.process(myPyramid.toString());
        }


   }

}
