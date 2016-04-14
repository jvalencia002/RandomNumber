/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber2;

/**
 *
 * @author Joeyvalencia
 */
public class RandomNumber2 {
	private int num=0;

	// lap 1 
	public int GetANumber_Between_1_and_10()

	{		
		num= 1 + (int) (Math.random()*10);
		return num;
	}
	//lap 2 with you choice random number max
	public int GetANumber(int high)
	{
		//Returns a number between 0 and High

		num= (int) (Math.random()*high);
		return num;
	}
}