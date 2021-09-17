package co.yedam;

public class Member 
{
	/* 필드(Field) = 정보를 저장하기 위함. */
	int MemberID;
	String Name;
	String Phone;
	
	/* 메소드(Method) = 기능을 표현하기 위함. */
	public void showInfo() {
		System.out.println("아이디 : " + MemberID + ", 이름 : " + Name + ", 연락처 : " + Phone);
	}
}
