package bombermanfinal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author faurehu
 */
public class BombermanFinal {

    public static void main(String[] args) {
        /*
        Game g = new Game(false);
        Frame frame = new Frame(g);
        frame.setLayout(new BorderLayout());
        frame.setSize(400,400);
        Info info = new Info(g);
        //frame.setVisible(true);
        //Map m = new Map(g);
        frame.add(info);
        frame.pack();
        frame.setVisible(true);
        */
        
        //Game g = new Game(false);
        /*
        JFrame info = new JFrame("Welcome to bomberman.");
        info.setSize(400,400);
        
        //Map map= new Map(g);
        
        JButton button = new JButton("Play");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //map.setVisible(true);
            }
            
        });
        
        info.add(button);
        info.pack();
        info.setVisible(true);
                */
        
        Game g = new Game(false);
        Map map = new Map(g);
        map.setVisible(true);
        
    }
    
}
