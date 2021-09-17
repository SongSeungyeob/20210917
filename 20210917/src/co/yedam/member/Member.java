package co.yedam.member;

public class Member 
{
	/* public = Member class 이 외에서도 사용 가능하도록. */
	/* private = Member class 이 외에서는 사용하지 못하도록 제한. */
	private String Member_ID;
	private String Name;
	private String Address;
	
	/* 생성자 : 필드에 값을 초기화. */
	public Member() {
		Member_ID = "user1";
		Name = "박지원";
		Address = "대구중구 내일동";
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
		System.out.println("아이디 : " + Member_ID + " , 이름 : " + Name + " , 주소 : " + Address);
	}
	
	public void ShowMemberID() {
		System.out.println("아이디 : " + Member_ID);
	}
	
	public void ShowName() {
		System.out.println("이름 : " + Name);
	}
	
	public void ShowAddress() {
		System.out.println("주소 : " + Address);
	}
}
