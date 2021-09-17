package co.yedam.lesson;

/* *
 * 학생이름 , 연락처 , 학생주소 
 * */
public class Student 
{
	private String StudentName;
	private String Phone;
	private String Address;
	
	public Student(String Name, String Phone, String Address) {
		this.StudentName = Name;
		this.Phone = Phone;
		this.Address = Address;
	}
	
	public void setStudentName(String Name) {
		this.StudentName = Name;
	}
	
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getStudentName() {
		return this.StudentName;
	}
	
	public String getPhone() {
		return this.Phone;
	}
	
	public String getAddress() {
		return this.Address;
	}
}
