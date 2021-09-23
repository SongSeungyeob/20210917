package co.yedam.inherit;
/*
 * People의 상속을 받는 Student Class. *
 * 자식 extends 부모.
 */
public class Student extends People
{
	private int StudentNo;
	
	Student(String Name, String Ssn) {
		super(Name, Ssn); // Super = 부모 Class의 생성자를 호출하겠다.
	}
	
	Student(String Name, String Ssn, int StudentNo) {
		super(Name, Ssn);
		this.StudentNo = StudentNo;
	}
	
	public int getStudentNo() {
		return StudentNo;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Name : " + super.getName() + ", SSN : " + this.getSsn() + ", SNO : " + StudentNo);
	}
	
	/*
	 * Student -> People -> Object.
	 * Object Class = 모든 Class는 보이지는 않지만, Object 라는 Class의 상속을 받고 있다.
	 * 모든 Class는 public class ClassName (extends Object) 와 같은 상태이다.
	 */
	
	@Override
	public String toString() {
		return "학생 [이름 : " + this.getName() + " 주민번호 : " + this.getSsn() + "  학생번호 : " + this.getStudentNo() + "]";
	}
	
}
