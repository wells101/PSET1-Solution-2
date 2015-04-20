package Mario;

 import java.util.Scanner;
 import OutputStrategy.*;
 
public class Pyramid {
    StringBuilder inBuilder = new StringBuilder(); //original creation logic
    StringBuilder outBuilder = new StringBuilder();
    /** As completed, lines from inBuilder should be appended to the Outbuilder
     *  with the new line escape added to the end.
     */
    int height;
    
   
    public Pyramid(int h){  //if for some reason i'm asked to build a pyramid and know the height...
        this.height = h;
        buildPyramid(this.height);
    }
    
    public void buildPyramid(int h){
        for (int spaces = 0; spaces <= height - 2; spaces++) {
        inBuilder.append(' ');//start building the pyramid
        } 
        inBuilder.append("##");//Number Hashes is (row + 2)

        outBuilder.append(inBuilder.toString());
        outBuilder.append(System.getProperty("line.separator"));
        while (inBuilder.lastIndexOf(" ") >= 0) {
            inBuilder.setCharAt(inBuilder.lastIndexOf(" "), '#');//replace the last space with a hash.
            outBuilder.append(inBuilder.toString());
            outBuilder.append(System.getProperty("line.separator"));
           }
       }
    
    @Override
    public String toString(){
        return outBuilder.toString();
    }
   
}
