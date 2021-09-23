package co.yedam.inherit;
/*
 * Bus -> Vehicle
 * Taxi -> Vehicle
 * ����� "������" : �Ű������� ���� �ٸ� ��� ����
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
