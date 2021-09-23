package co.yedam.inherit;

public class CompFriend extends Friend 
{
	private String Depart;
	
	public CompFriend(String Name, String Phone, String Depart) {
		super(Name, Phone);
		this.Depart = Depart;
	}

	public String getDepart() {
		return Depart;
	}

	public void setDepart(String depart) {
		Depart = depart;
	}

	@Override
	public String toString() {
		
		return "CompFriend [ Name = " + getName() + ", Phone = " + getPhone() + ", Depart = " + Depart + " ]";
	}
	
}
