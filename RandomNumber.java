/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

import java.util.Random;
public class RandomNumber {
	

	public int GetANumber_Between_1_and_10() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	
	}
}