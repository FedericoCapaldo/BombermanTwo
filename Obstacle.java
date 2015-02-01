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
public class Obstacle {
	
	boolean isDestructible;

	public Obstacle(boolean b) {

		isDestructible = b;

	}

	public boolean isDestructible() {
		return isDestructible;
	}

}
