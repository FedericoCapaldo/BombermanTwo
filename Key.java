/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanfinal;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author faurehu
 */
public class Key extends KeyAdapter {
    
    public void keyTyped(KeyEvent e) {
        
        switch(e.getKeyCode()) {
            case KeyEvent.VK_A:
                
                break;
            case KeyEvent.VK_W:
                break;
            case KeyEvent.VK_D:
                break;
            case KeyEvent.VK_S:
                break;
            case KeyEvent.VK_UP:
                break;
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_SPACE:
                break;
            case KeyEvent.VK_SHIFT:
                if(e.getKeyLocation() == KeyEvent.KEY_LOCATION_RIGHT) {
                    
                }
                break;
        }
        
        
    }
    
}
