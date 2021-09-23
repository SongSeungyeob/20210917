package co.yedam;

public class MemberExample 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member();
		m1.MemberID = 10;
		m1.Name = "박미림";
		m1.Phone = "010-1111-2222";
		
		Member m2 = new Member();
		m2.MemberID = 20;
		m2.Name = "홍길동";
		m2.Phone = "010-3333-4444";
		
		Member[] Members = { m1 , m2 };
		for(Member M : Members) {
			System.out.println("아이디 :" + M.MemberID);
			System.out.println("이름 : " + M.Name);
			System.out.println("연락처 : " + M.Phone);
		}
		System.out.println("===========================================================");
		
		m1.Name = "김미림";
		Members[0].Phone = " 010-5555-6666";
		for(Member M : Members) {
			M.showInfo();
		}
	
		Student S1 = new Student();
		S1.Name = "Hong";
		
	}
}