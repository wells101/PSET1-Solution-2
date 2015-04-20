/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputStrategy;

/**
 *
 * @author Gaming
 */
public class OutputContext {
    private OutputStrategy myStrategy;
    

    public void setStrategy(OutputStrategy strategy){
        this.myStrategy = strategy;
    }
       
    public void process(int height){
        myStrategy.outputData(height);
    }
    
    public void process(String s){
        myStrategy.outputData(s);
    }
}
