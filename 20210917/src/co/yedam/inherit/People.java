package co.yedam.inherit;
/*
 * 상속 : 부모 -> 자식. 물려받는 개념.
 * 
 */
public class People 
{
	private String Name;
	private String Ssn;
	
	public People() { }
	
	public People(String Name, String Ssn) {
		this.Name = Name;
		this.Ssn = Ssn;
	}

	public String getName() {
		return Name;
	}

	public String getSsn() {
		return Ssn;
	}
	
	public void showInfo() {
		System.out.println("이름은 " + Name + ", 주민번호는 " + Ssn);
	}

	@Override
	public String toString() {
		return "People [Name=" + Name + ", Ssn=" + Ssn + "]";
	}
}
