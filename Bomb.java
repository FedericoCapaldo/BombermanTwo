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
public class Bomb {
	
	Long time;
	Block position; 

	public Bomb(Block b, Player p) {

		position = b;

		time = System.currentTimeMillis();

		while (time < 3000) {

			time = System.currentTimeMillis();

		}

		explode();

	}

	public void explode() {

		position.explode(3);

	}

}
