/*R.3.18
 * Read Exercise E3.12, but do not implement the Car class yet. 
 * Write a tester class that tests a scenario in which gas is added to the car, 
 * the car is driven, more gas is added, and the car is driven again. 
 * Print the actual and expected amount of gas in the tank.
 */

public class Car{
	int gas;
	int mpg;
	
	public Car(int mpg)
	{
		this.mpg = mpg;
	}
	
	public void addGas(int newGas)
	{
		gas += newGas;
	}
	
	public void drive(int distance)
	{
		int lostGas = distance/mpg;
		gas = gas-lostGas;
	}
	
	public int getGas()
	{
		return gas;
	}
}
