package co.yedam;

public class Member 
{
	/* �ʵ�(Field) = ������ �����ϱ� ����. */
	int MemberID;
	String Name;
	String Phone;
	
	/* �޼ҵ�(Method) = ����� ǥ���ϱ� ����. */
	public void showInfo() {
		System.out.println("���̵� : " + MemberID + ", �̸� : " + Name + ", ����ó : " + Phone);
	}
}
