package co.yedam.member;

public class MemberExample 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member("user1", "�ڹ̸�", "�߱� ���ϵ�"); // <- ������ ȣ��.
		m1.showInfo();
		
		//m1.Member_ID = "user1";
		//m1.Name = "Hong";
		//m1.Address = "�߱� ���ϵ�";
		
		m1.setMemberID("user1");
		m1.setName("Hong");
		m1.setAddress("�߱� ���ϵ�");
		
//		System.out.println("���̵� : " + m1.Member_ID);
//		System.out.println("�̸� : " + m1.Name);
//		System.out.println("�ּ� : " + m1.Address);
		
		System.out.println("���̵� : " + m1.getMemberID());
		System.out.println("�̸� : " + m1.getName());
		System.out.println("�ּ� : " + m1.getAddress());
		
		Member m2 = new Member("user2");
		m2.setName("�۽¿�");
		m2.setAddress("����");
		m2.showInfo();
		
		Member m3 = new Member("user3", "ȫ�浿", "�뱸 �Ŵ絿");
		m3.showInfo();
		m3.setName("�ڱ浿");
		m3.showInfo();
	}
}
