package co.yedam.inherit;

public class UnivFriend extends Friend  
{
	private String Major;
	
	public UnivFriend(String Name, String Phone, String Major) {
		super(Name, Phone);
		this.Major = Major;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [ Name = " + this.getName() + ", Phone = " + this.getPhone()+ ", Major = " + Major + " ]";
	}	
}
