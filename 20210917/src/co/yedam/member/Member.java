package co.yedam.member;

public class Member 
{
	/* public = Member class �� �ܿ����� ��� �����ϵ���. */
	/* private = Member class �� �ܿ����� ������� ���ϵ��� ����. */
	private String Member_ID;
	private String Name;
	private String Address;
	
	/* ������ : �ʵ忡 ���� �ʱ�ȭ. */
	public Member() {
		Member_ID = "user1";
		Name = "������";
		Address = "�뱸�߱� ���ϵ�";
	}
	
	public Member(String mID) {
		Member_ID = mID;
	}
	
	public Member(String mID, String N, String A) {
		Member_ID = mID;
		Name = N;
		Address = A;
	}
	
	public void setMemberID(String mID) {
		Member_ID = mID;
	}
	
	public void setName(String n) {
		Name = n;
	}
	
	public void setAddress(String a) {
		Address = a;
	}
	
	public String getMemberID() {
		return Member_ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void showInfo() {
		System.out.println("���̵� : " + Member_ID + " , �̸� : " + Name + " , �ּ� : " + Address);
	}
	
	public void ShowMemberID() {
		System.out.println("���̵� : " + Member_ID);
	}
	
	public void ShowName() {
		System.out.println("�̸� : " + Name);
	}
	
	public void ShowAddress() {
		System.out.println("�ּ� : " + Address);
	}
}
