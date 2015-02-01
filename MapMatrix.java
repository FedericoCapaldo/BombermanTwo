/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanfinal;

import java.util.Random;

/**
 *
 * @author faurehu
 */
public class MapMatrix {
    
    private Block[][] mapMatrix;

    public MapMatrix() {
        
        mapMatrix = new Block[21][21];
        
        for(int i = 0; i < 21; ) {
            for(int j = 0; j < 21; j++) {
                mapMatrix[i][j] = new Block(i,j,this);
            }
        }
        
        for(int i = 1; i < 20; i = i+2) {
            for(int j = 1; j < 20; j = j+2) {                
                    mapMatrix[i][j].setObstacle(false);
                   
            }
        }
        
    }
    
    /*
    public Block[][] getMatrix {
        return mapMatrix
    }*/

    public void populateMap() {
        
        for(int i = 2; i < 20; i = i+2 ) {
            for(int j = 2; j < 20; j = j+2) {
                
                Random r = new Random();
                if (r.nextInt(10) < 5) {
                mapMatrix[i][j].setObstacle(true);
                }
            }
        }
        
    }
    
    public Block getBlock (int x, int y) {
        
        Block b = null;
 
        int cx = x;
        int cy = y;
              
        
        try {
        b = mapMatrix[cx][cy];
        
        } catch (NullPointerException e) {

        }
        return b;
     
    }
    
    public Block getFirstBlock() {
        
        return mapMatrix[1][1];
        
    }

    public Block getLastBlock() {
        
        return mapMatrix[19][19];
        
    }

    boolean inexistentMaterialCheck(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
