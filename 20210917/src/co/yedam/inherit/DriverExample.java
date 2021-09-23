package co.yedam.inherit;
/*
 * Bus -> Vehicle
 * Taxi -> Vehicle
 * 상속의 "다형성" : 매개변수에 따라 다른 결과 도출
 */
public class DriverExample 
{
	public static void main(String[] args) 
	{
		Vehicle V = new Vehicle();
		Bus B = new Bus();
		Taxi T = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(V);
		driver.drive(B);
		driver.drive(T);
	}
}
