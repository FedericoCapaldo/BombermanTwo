/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanfinal;

import java.awt.*;
//import java.net.URL;
import javax.swing.*;



/**
 *
 * @author faurehu
 */
public class Map extends JFrame {
    
    private MapMatrix m;
    

        //ImageIcon nothing = new ImageIcon("http://i.imgur.com/ibsQd5P.jpg");
        //ImageIcon indistructible = new ImageIcon("http://i.imgur.com/kELNV0G.jpg");
        //ImageIcon distructible = new ImageIcon("http://i.imgur.com/ibsQd5P.jpg");
        JLabel[][] labels;

    
    public Map(Game g) {

        labels = new JLabel[21][21];
        this.setSize(1000,1000);
        this.setLayout(new GridLayout(20,20));
        
        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                labels[i][j] = new JLabel();
                this.add(labels[i][j]);
            }
        }

        MapMatrix m = new MapMatrix();
        m.populateMap();
        
    }
    
    public void update() {
        
        int img;
        
        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                img = m.getBlock(i,j).img();
                switch(img) {
                    case 0:
                        //labels[i][j].setIcon(nothing);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break; 
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }
        }
    }
    
    public void setBomb(JLabel l) {
        
    }
    
    public void setDestructible(JLabel l) {
        
    }
    
    public void setUndestructible(JLabel l) {
        
    }
    
    public void setPlayer1(JLabel l) {
        
    }
    
    public void setPlayer2(JLabel l) {
        
    }
    
    public void explode(JLabel l) {
        
        
    } 
    
    public void setNothing(JLabel l) {
        
        
        
    }
    
}
