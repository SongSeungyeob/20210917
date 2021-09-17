package co.yedam.lesson;

/* * 
 * 이름 , 과목 ,
 * */
public class Teacher 
{	
	private String Name;
	private String Major;
	
	public Teacher(String Name, String Major) {
		this.Name = Name;
		this.Major = Major;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setMajor(String Major) {
		this.Major = Major;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getMajor() {
		return this.Major;
	}
}
