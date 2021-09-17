package co.yedam.member;

public class MemberExample 
{
	public static void main(String[] args) 
	{
		Member m1 = new Member("user1", "박미림", "중구 남일동"); // <- 생성자 호출.
		m1.showInfo();
		
		//m1.Member_ID = "user1";
		//m1.Name = "Hong";
		//m1.Address = "중구 남일동";
		
		m1.setMemberID("user1");
		m1.setName("Hong");
		m1.setAddress("중구 남일동");
		
//		System.out.println("아이디 : " + m1.Member_ID);
//		System.out.println("이름 : " + m1.Name);
//		System.out.println("주소 : " + m1.Address);
		
		System.out.println("아이디 : " + m1.getMemberID());
		System.out.println("이름 : " + m1.getName());
		System.out.println("주소 : " + m1.getAddress());
		
		Member m2 = new Member("user2");
		m2.setName("송승엽");
		m2.setAddress("경산시");
		m2.showInfo();
		
		Member m3 = new Member("user3", "홍길동", "대구 신당동");
		m3.showInfo();
		m3.setName("박길동");
		m3.showInfo();
	}
}
