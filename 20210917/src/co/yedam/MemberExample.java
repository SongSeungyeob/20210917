package co.yedam;

public class MemberExample 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member();
		m1.MemberID = 10;
		m1.Name = "�ڹ̸�";
		m1.Phone = "010-1111-2222";
		
		Member m2 = new Member();
		m2.MemberID = 20;
		m2.Name = "ȫ�浿";
		m2.Phone = "010-3333-4444";
		
		Member[] Members = { m1 , m2 };
		for(Member M : Members) {
			System.out.println("���̵� :" + M.MemberID);
			System.out.println("�̸� : " + M.Name);
			System.out.println("����ó : " + M.Phone);
		}
		System.out.println("===========================================================");
		
		m1.Name = "��̸�";
		Members[0].Phone = " 010-5555-6666";
		for(Member M : Members) {
			M.showInfo();
		}
	
		Student S1 = new Student();
		S1.Name = "Hong";
		
	}
}