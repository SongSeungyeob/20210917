package co.yedam.inherit;

public class Friend  
{
	private String Name;
	private String Phone;
	
	public Friend(String Name, String Phone) {
		this.Name = Name;
		this.Phone = Phone;
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

	@Override
	public String toString() {
		return "Friend [ Name = " + Name + ", Phone = " + Phone + " ]";
	}
	
}
