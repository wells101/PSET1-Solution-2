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
public class OutputConsole implements OutputStrategy
{
    public void outputData(int height){
        StringBuilder inBuilder = new StringBuilder();
        for (int spaces = 0; spaces <= height - 2; spaces++) {
            inBuilder.append(' ');//start building the pyramid
        } 
        inBuilder.append("##");//Number Hashes is (row + 2)

        System.out.println(inBuilder.toString());//Print the first line
        while (inBuilder.lastIndexOf(" ") >= 0) {
            inBuilder.setCharAt(inBuilder.lastIndexOf(" "), '#');//replace the last space with a hash.
            System.out.println(inBuilder.toString());
           }
       }
}
