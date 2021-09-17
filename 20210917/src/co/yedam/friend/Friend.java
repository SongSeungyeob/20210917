package co.yedam.friend;

public class Friend 
{
	//1. ģ�� ��� 2. ģ�� ���� ���� 3. ģ�� ��� 4. ģ�� ��� ��ȸ 5. ģ�� ���� 9. ����
	//ģ���� ���� : �̸�(Str) , ����ó(Str) , email(Str) , Ű(int) , ������(int) 
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
		System.out.printf("**************************[ ģ�� ���� ]**************************\n");
		System.out.printf("�̸� :\t%s\n����ó : \t%s\nE-Mail :\t%s\nŰ : \t\t%f\n������ : \t%f\n", 
				Name, Phone, Email, Height, Weight);
		System.out.printf("**************************************************************\n");
	}
}
