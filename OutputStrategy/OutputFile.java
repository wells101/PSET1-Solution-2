/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputStrategy;
import java.io.*;

/**
 *
 * @author Gaming
 */
public class OutputFile implements OutputStrategy
{
    public void outputData(int height){
        StringBuilder inBuilder = new StringBuilder();
        
        for (int spaces = 0; spaces <= height - 2; spaces++) {
            inBuilder.append(' ');//start building the pyramid
        }
        
        inBuilder.append("##");//Number Hashes is (row + 2)
        
        try (PrintWriter file = new PrintWriter("pyramid.txt")){
            file.println(inBuilder.toString());//Print the first line
            while (inBuilder.lastIndexOf(" ") >= 0) {
                inBuilder.setCharAt(inBuilder.lastIndexOf(" "), '#');//replace the last space with a hash.
                file.println(inBuilder.toString());//print the next line.
            }
            file.close();
        } catch (IOException e){
            System.out.println("Error: " + e.toString());
        }
    }
}
