/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanfinal;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author faurehu
 */
public class Info extends JPanel{
    
    JButton Play;
    JButton Options;
    JFrame Settings;
    JButton onePlayer;
    JButton twoPlayer;

    
    public Info(Game g) {
        this.setLayout(new GridLayout(2,2));

        Play = new JButton("Start");
        Options = new JButton("Settings");
        onePlayer = new JButton("One Player");
        twoPlayer = new JButton("Two Players");

        twoPlayer.setVisible(false);
        onePlayer.setVisible(false);

        this.add(Play);
        this.add(Options);
        this.add(onePlayer);
        this.add(twoPlayer);

        Play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Play.setVisible(false);
                Options.setVisible(false);
                onePlayer.setVisible(true);
                twoPlayer.setVisible(true);
                onePlayer.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Map gameMap = new Map(g);
                        gameMap.setSize(500,500);
                        gameMap.setVisible(true);
                    }
                });
                twoPlayer.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //START MULTIPLAYER GAME
                    }
                });
            }
        });

    }
    
}
