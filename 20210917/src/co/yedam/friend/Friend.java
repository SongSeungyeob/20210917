package co.yedam.friend;

public class Friend 
{
	//1. 친구 등록 2. 친구 정보 수정 3. 친구 목록 4. 친구 목록 조회 5. 친구 삭제 9. 종료
	//친구의 정보 : 이름(Str) , 연락처(Str) , email(Str) , 키(int) , 몸무게(int) 
	String Name;
	String Phone;
	String Email;
	double Height;
	double Weight;
	
	public Friend(String name, String phone, String email, double height, double weight) {
		Name = name;
		Phone = phone;
		Email = email;
		Height = height;
		Weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}
	
	public void showFriendInfo() {
		System.out.printf("**************************[ 친구 정보 ]**************************\n");
		System.out.printf("이름 :\t%s\n연락처 : \t%s\nE-Mail :\t%s\n키 : \t\t%f\n몸무게 : \t%f\n", 
				Name, Phone, Email, Height, Weight);
		System.out.printf("**************************************************************\n");
	}
}
