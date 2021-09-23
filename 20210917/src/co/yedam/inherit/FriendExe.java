package co.yedam.inherit;
import co.yedam.ScanUtil;

public class FriendExe  
{
	// ģ�� , �б�ģ�� , ȸ��ģ�� => �迭�� ����.
	// CompFriend -> Friend.
	// UnivFriend -> Friend
	private static FriendExe Singleton = new FriendExe();
	private Friend[] friends;
	
	private FriendExe() {
		friends = new Friend[100];
	}
	
	public static FriendExe getInstance() {
		return Singleton;
	}
	
	public void execute() {
		
		friends[0] = new Friend("ȫ�浿", "1111-1211");
		friends[1] = new Friend("��浿", "2222-1211");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������");
		friends[5] = new Friend("ȫ�浿", "1111-1234");
		
		while(true) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("1.��� 2. ��ȸ 3. ���� 4. ���� 5. ����");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
			
			int Menu = ScanUtil.readInt("�޴��� �����ϼ���. ");
			
			if(Menu == 1) {
				System.out.println("���");
				addFriend();
			} else if(Menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if(Menu == 3) {
				System.out.println("����");
				modify();
			} else if(Menu == 4) {
				System.out.println("����");
				remove();
			} else if(Menu == 5) {
				System.out.println("[ ���� �ϰڽ��ϴ�. ]");
				break;
			} 
		}
		System.out.println("# ���α׷� ���� #");
	}
	
	private void remove() {
		System.out.println("[ ģ����� ]= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) continue;
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		int Select = ScanUtil.readInt("������ ģ���� ��ȣ�� �����ϼ���.");
		if(friends[Select] == null) {
			System.out.println("�� ������ ģ�� ������ �������� �ʽ��ϴ�. ��");
			System.out.println("[ ������ �����Ͽ����ϴ�. ]");
		} else {
			friends[Select] = null;
			System.out.println("[ ������ �Ϸ��Ͽ����ϴ�. ]");
		}
		
	}
	
	private void modify() {
		System.out.println("[ ģ����� ]= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) continue;
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		
		int Select = ScanUtil.readInt("������ ģ���� ��ȣ�� �����ϼ���.");
		String Phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���.");
		if(Phone.equals("")) {
			System.out.println("[ ��ȭ��ȣ�� �������� �����̽��ϴ�. ]");
		} else {
			friends[Select].setPhone(Phone);
			System.out.println("[ ��ȭ��ȣ�� �����ϼ̽��ϴ�. ]");
		}
		
		if(friends[Select] instanceof UnivFriend) {
			String Major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���.");
			if (Major.equals("") == false) {
				((UnivFriend) friends[Select]).setMajor(Major);
				System.out.println("[ ������ �����ϼ̽��ϴ�. ]");
			} else {
				System.out.println("[ ������ �������� �����̽��ϴ�. ]");
			}
		} else if(friends[Select] instanceof CompFriend) {
			String Depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���.");
			if (Depart.equals("") == false) {
				((CompFriend) friends[Select]).setDepart(Depart);
				System.out.println("[ �μ��� �����ϼ̽��ϴ�. ]");
			} else {
				System.out.println("[ �μ��� �������� �����̽��ϴ�. ]");
			}
		}
		System.out.println("[ ������ �Ϸ��Ͽ����ϴ�. ]");
	}
	
	private void showList() {
		/*
		 * �̸� & ����ó�� �Է� => 
		 * ȫ�浿, ��浿 -> '�浿'�� �˻��ϸ� ȫ�浿 ��浿 ��� ��������.
		 * 1111-1211 , 2222-1211 -> '1211'�� ��ȸ�� �ϸ� '1211'�� ����ִ� ��� ������ �� ��������.
		 * �浿 , 1211 -> �̸� �߿� '�浿'�� ����, ����ó�� '1211'�� ���� ��� ���
		 */
		boolean Name_Flag, Phone_Flag;
		Name_Flag = Phone_Flag = false;
		String Name, Phone;
		Name = ScanUtil.readStr("ã���� �ϴ� �̸��� �Է��ϼ���. [ �Է��� ������ ������ '����'�� �������� ]");
		Phone = ScanUtil.readStr("ã���� �ϴ� ����ȣ�� �Է��ϼ���. [ �Է��� ������ ������ '����'�� �������� ]");
		if (Name.equals("") == false)
			Name_Flag = true;
		if (Phone.equals("") == false)
			Phone_Flag = true;
		
		boolean Search = false;
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) continue;
			
			if(Name_Flag == true) {
				if(Phone_Flag == true) {
					if((friends[i].getName().indexOf(Name) != -1) && (friends[i].getPhone().indexOf(Phone) != -1)) {
						Search = true;
						System.out.println(friends[i].toString());
					}
				} else {
					if(friends[i].getName().indexOf(Name) != -1) {
						Search = true;
						System.out.println(friends[i].toString());
					}
				}
			} else {
				if (Phone_Flag == true) {
					if (friends[i].getPhone().indexOf(Phone) != -1) {
						Search = true;
						System.out.println(friends[i].toString());
					} 
				}else {
					System.out.println(friends[i].toString());
				}
			}
		}
		if(Search == false) {
			System.out.println("[ ã���ô� ģ�� ������ ��ġ�ϴ� ����� �����ϴ�. ]");
		} else {
			System.out.println("[ ã���ô� ģ���� ���� ����Դϴ�. ]");
		}
	}
	
	private void addFriend()	{
		/*
		 * �׳� ģ���� �������, �б�ģ���� �������, ȸ��ģ���� ������� ??
		 * 1. �׳�ģ�� = �̸� / ����ó
		 * 2. �б�ģ�� = �̸� / ����ó / ����
		 * 3. ȸ��ģ�� = �̸� / ����ó / �μ���
		 */
		System.out.println("1. ģ�� 2. �б�ģ�� 3. ȸ��ģ��");
		int Choice = ScanUtil.readInt("����� ģ���� �����ϼ���.");
		
		String Name = ScanUtil.readStr("ģ�� �̸��� �Է��ϼ���.");
		String Phone = ScanUtil.readStr("����ó�� �Է��ϼ���.");
		Friend friend = null;
		if(Choice == 1) {
			friend = new Friend(Name, Phone);
		} else if(Choice == 2) {
			String Major = ScanUtil.readStr("������ �Է��ϼ���.");
			friend = new UnivFriend(Name, Phone, Major);
		} else if(Choice == 3) {
			String Depart = ScanUtil.readStr("�μ��� �Է��ϼ���.");
			friend = new CompFriend(Name, Phone, Depart);
		}
		
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("[ ģ�� ����� �����Ͽ����ϴ�. ]");
	}
}
