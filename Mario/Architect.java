package Mario;



/**
 *
 * @author Gaming
 */
public class Architect {
    private static Architect architect;
    
    private Architect(){
        
    }
    
    public static Architect getInstance(){
        if(architect == null)
        {
            architect = new Architect();
        }
        return architect;
    }
    public static Pyramid pyramid(int h){
        return new Pyramid(h);
    }
}
