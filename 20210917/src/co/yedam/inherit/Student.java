package co.yedam.inherit;
/*
 * People�� ����� �޴� Student Class. *
 * �ڽ� extends �θ�.
 */
public class Student extends People
{
	private int StudentNo;
	
	Student(String Name, String Ssn) {
		super(Name, Ssn); // Super = �θ� Class�� �����ڸ� ȣ���ϰڴ�.
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
	 * Object Class = ��� Class�� �������� ������, Object ��� Class�� ����� �ް� �ִ�.
	 * ��� Class�� public class ClassName (extends Object) �� ���� �����̴�.
	 */
	
	@Override
	public String toString() {
		return "�л� [�̸� : " + this.getName() + " �ֹι�ȣ : " + this.getSsn() + "  �л���ȣ : " + this.getStudentNo() + "]";
	}
	
}
