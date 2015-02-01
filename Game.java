/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanfinal;

/**
 *
 * @author faurehu
 */
public class Game {
    
    MapMatrix mm;   
    
    public Game(boolean multi) {
        
        mm = new MapMatrix();

	Player first = new Player(mm.getFirstBlock());
        mm.getFirstBlock().playerIn(first);

        if(multi) {

            Player second = new Player(mm.getLastBlock());
            mm.getLastBlock().playerIn(second);

	}

	mm.populateMap();
        
        
    }
    
    public void print() {
        mm.toString();
    }
    
    public MapMatrix getMatrix() {
        return mm;
    }
    
}
