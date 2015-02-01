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
public class Player {

    private int Totlives;
    private Block position;
    private static long tStart;
    private static long tEnd;
    private static int counter = 0;
    int id;

    public int getId() {
        return id;
    }
    
    public Player(Block _position) {

        id = counter;
        counter++;
        position = _position;
        Totlives = 3;

    }

    public void updateCoordinates(Block b) {
        position.playerOut();
        position = b;
        b.playerIn(this);
    };
    
    public void hit() {
        Totlives --;
    }

    public void move(int key) {
        // 0 == up
        // 1 == down
        // 2 == left
        // 3 == right

        Block target = null;

        if (key == 0) {
            target = position.getUp();
        } else if(key == 1) {
            target = position.getDown();
        } else if(key == 2) {
            target = position.getLeft();
        } else if(key == 3) {
            target = position.getRight();
        } 
        
        if(target.isAvailable() && target != null) {
            updateCoordinates(target);
        } 

    }

    public void bomb() {

        if(canBomb()) {
            
            position.setBomb(new Bomb(position,this));
        }

    }

    public boolean canBomb() {

        tEnd = System.currentTimeMillis();

        if(tEnd - tStart < 3000) {
            return true;
        } else {
            return false;
        }

    }

}
