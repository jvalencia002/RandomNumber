
package randomnumber;

public class RandomNumber {
        
  private int Low;
  private int High;
  public int GetANumer_Between_1_and_10()
  {
  	int computerNum;
  	computerNum = 1 + (int)(Math.random()*10);
  	return computerNum;
  }
  public int GetANumber()
  {
  	int computerNum;
  	computerNum = Low + (int)(Math.random()*High);
  	return computerNum;
  }
  public RandomNumber()
  {
  	Low = 1;
  	High = 10;
  }
  public RandomNumber( int low ,int high )
  {
  	Low = low;
  	High = high;
  }
}
        

    
        
	
