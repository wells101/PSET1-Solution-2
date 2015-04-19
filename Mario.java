import java.util.Scanner;
import java.io.*;

public class Mario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        StringBuilder inBuilder = new StringBuilder();

        int height, outputOption;
        do {
            System.out.println("Enter Height of Pyramid: ");
            height = inputScanner.nextInt();
        } while (height > 23 || height < 0);

        do{
            System.out.println("Choose Output. /n 1: Console /n 2: File");
            outputOption = inputScanner.nextInt();
        } while (outputOption != 1 || outputOption != 2);
        //establish the first line in Stringbuilder.  There should be Height-2 Spaces, and 2 hashes

        for (int spaces = 0; spaces <= height - 2; spaces++) {
            inBuilder.append(' ');//start building the pyramid
            //start with the first row. Number Spaces is (height - 1) - (row + 2)
        }
        inBuilder.append("##");//Number Hashes is (row + 2)

        if(outputOption == 1) {
            System.out.println(inBuilder.toString());//Print the first line
            while (inBuilder.lastIndexOf(" ") >= 0) {
                inBuilder.setCharAt(inBuilder.lastIndexOf(" "), '#');//replace the last space with a hash.
                System.out.println(inBuilder.toString());//print the next line.
            }
        }
        else {
            try (PrintWriter file = new PrintWriter("pyramid.txt"))
            {
                file.println(inBuilder.toString());//Print the first line
                while (inBuilder.lastIndexOf(" ") >= 0) {
                    inBuilder.setCharAt(inBuilder.lastIndexOf(" "), '#');//replace the last space with a hash.
                    file.println(inBuilder.toString());//print the next line.
                }

            } catch (IOException e){
                    System.out.println("Error: " + e.toString());
                }
        }


    }

}
