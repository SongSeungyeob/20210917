package co.yedam.inherit;
/*
 * ��� : �θ� -> �ڽ�. �����޴� ����.
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
		System.out.println("�̸��� " + Name + ", �ֹι�ȣ�� " + Ssn);
	}

	@Override
	public String toString() {
		return "People [Name=" + Name + ", Ssn=" + Ssn + "]";
	}
}
