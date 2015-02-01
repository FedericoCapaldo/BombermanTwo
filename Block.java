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
public class Block {

    private int blockPosX,blockPosY;
    private Obstacle obstacle;
    private Player player;
    private final MapMatrix mm;

    private boolean hasPlayer = false;
    private boolean hasBomb = false;
    private boolean hasDestructible = false;
    private boolean hasObstacle = false;
    private int status;
    
    // hasBomb = 0
    // explosion
    // undstruct
    // destructable
    // empty
    //player 1
    // player 2
    
    
    public boolean isDestructible() {
        return hasDestructible;
    }
    
    public int img() {
        
        return status;
        
    }

    public Block (int x, int y, MapMatrix _mm) {
        
        mm = _mm;
        blockPosX = x;
        blockPosY = y;
        status = 2;

    }

    public void addPos(int x,int y){
        blockPosX=x;
        blockPosY=y;
    }

    public void setObstacle(boolean b) {
        
        obstacle = new Obstacle(b);

        if(b) {
            hasDestructible = b;
        }
        
        hasObstacle = true;
        
    }

    public void playerIn (Player p) {
        player = p;
        hasPlayer = true;
        status = p.getId();
    }

    public void playerOut () {
        player = null;
        hasPlayer = false;
        status = 2;
    }

    public int getBlockPosX() {
        return blockPosX;
    }

    public int getBlockPosY(){
        return blockPosY;
    }

    public void explode(int i) {

        if(hasBomb) {
        hasBomb = false;
        status = 3;
        }

        if(hasDestructible) {
        obstacle = null;
        hasDestructible = false;
        status = 3;
        }

        if(hasPlayer) {
        player.hit();
        }

        explodeNeighbours(i-1);

    }

    public void setBomb(Bomb b) {
        hasBomb = true;
        status = 4;
    }

    public Block[] neighbours() {
        Block[] neighbours = new Block[4];
        neighbours[0] = getUp();
        neighbours[1] = getDown();
        neighbours[2] = getRight();
        neighbours[3] = getLeft();
        return neighbours;
    }

    public Block getUp(){
        return mm.getBlock(blockPosX-1,blockPosY);
    }

    public Block getDown(){
        return mm.getBlock(blockPosX+1,blockPosY);
    }

    public Block getRight(){
        return mm.getBlock(blockPosX,blockPosY+1);
    }

    public Block getLeft(){
        return mm.getBlock(blockPosX,blockPosY-1);
    }

    public void explodeNeighbours(int i) {

        for(Block b: neighbours()) {
            b.explode(i);
        }

    }

    public boolean isAvailable() {
        if(hasPlayer != true && hasObstacle != true ) {
            return true;
        }
        
        return false;
    }
    
}
