package co.yedam.person;
/*
 * 이름 , 키 ,  몸무게, 혈액형, 나이
 */
public class Person 
{
	private String Name;
	private double Height;
	private double Weight;
	private String Blood;
	private int Age;
	
	public Person() {}
	public Person(String Name, double Height, double Weight, String Blood, int Age) {
		this.Name = Name;
		this.Height = Height;
		this.Weight = Weight;
		this.Blood = Blood;
		this.Age = Age;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setHeight(double Height) {
		this.Height = Height;
	}
	
	public void setWeight(double Weight) {
		this.Weight = Weight;
	}
	
	public void setBlood(String Blood) {
		this.Blood = Blood;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	public String getName() { 
		return this.Name;
	}
	
	public double getHeight() {
		return this.Height;
	}
	
	public double getWeight() {
		return this.Weight;
	}
	
	public String getBlood() {
		return this.Blood;
	}
	
	public int getAge() {
		return this.Age;
	}
}
