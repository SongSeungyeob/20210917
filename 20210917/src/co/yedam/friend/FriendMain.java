package co.yedam.friend;
import java.util.Scanner;
/*
 * ģ�� �ּҷ� ����.
 * 1. ģ�� ��� 2. ģ�� ���� ���� 3. ģ�� ��� 4. ģ�� ��� ��ȸ 5. ģ�� ���� 9. ����
 * ģ���� ���� : �̸�(Str) , ����ó(Str) , email(Str) , Ű(double) , ������(double) 
 */

public class FriendMain 
{
	static Scanner Sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Friend[] Friend_Arr = new Friend[100];
		
		while(true) {
			System.out.printf("[ �۾��� �����ϼ���. ] = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n");
			System.out.print("1. ��� 2. ��ȸ 3. ��� 4. ���� 5. ���� 6. ����");
			int Select = readInt(" �� ���ϴ� �޴�");
			if(Select == 1) {
				System.out.printf("[ ģ�� ��� ] �� �����ϼ̽��ϴ�.\n");
				String Name = readStr("�̸�");
				String Phone = readStr("����ó"); 
				String Email = readStr("E-Mail");
				double Height = readDouble("Ű");
				double Weight = readDouble("������");
				Friend New_Friend = new Friend(Name, Phone, Email, Height, Weight);
				for(int i = 0 ; i <Friend_Arr.length; i++) {
					if(Friend_Arr[i] == null) {
						Friend_Arr[i] = New_Friend;
						break;
					}
				}
				System.out.println("[ ģ�� ��� ] �� �����ϼ̽��ϴ�. ");
			} else if(Select == 2) {
				System.out.println("[ ģ�� ��ȸ ] �� �����ϼ̽��ϴ�.");
				String Name = readStr("��ȸ�� ģ���� �̸�");
				System.out.println("[ ��ȸ ��� ] .... ");
				boolean IsExist = false;
				for(int i = 0 ; i < Friend_Arr.length; i++) {
					if(Friend_Arr[i] != null && Friend_Arr[i].getName().indexOf(Name) != -1) {
						IsExist = true;
						Friend_Arr[i].showFriendInfo();
					}
				}
				if(IsExist == false) {
					System.out.println(" :: ���ǿ� �����ϴ� ģ���� �����ϴ� ::");
				} else {
					System.out.println(" :: ���ǿ� �����ϴ� ģ�� ����Ʈ �Դϴ�.");
				}
			} else if(Select == 3) {
				System.out.println("[ ģ�� ��� ��� ] �� �����ϼ̽��ϴ�.");
				for(int i = 0 ; i< Friend_Arr.length; i++) {
					if(Friend_Arr[i] == null) continue;
					Friend_Arr[i].showFriendInfo();
				}
			} else if(Select == 4) {
				System.out.println("[ ģ�� ���� ] �� �����ϼ̽��ϴ�.");
				String Name = readStr("������ ģ���� �̸�");
				String Phone = readStr(" (�Է��� ��ġ ���� ���, 'Enter'�� ��������) ������ ģ���� ��ȣ");
				String Email = readStr(" (�Է��� ��ġ ���� ���, 'Enter'�� ��������) ������ ģ���� E-Mail");
				String Height = readStr(" (�Է��� ��ġ ���� ���, 'Enter'�� ��������) ������ ģ���� Ű");
				String Weight = readStr(" (�Է��� ��ġ ���� ���, 'Enter'�� ��������) ������ ģ���� ������");
				boolean isExist = false;
				for(int i = 0 ; i < Friend_Arr.length; i++) {
					if(Friend_Arr[i] != null && Friend_Arr[i].getName().equals(Name)) {
						if(Phone.equals("") == false) {
							Friend_Arr[i].setPhone(Phone);
						}
						if(Email.equals("") == false) {
							Friend_Arr[i].setEmail(Email);
						}
						if(Height.equals("") == false) {
							Friend_Arr[i].setHeight(Double.parseDouble(Height));
						}
						if(Weight.equals("") == false) {
							Friend_Arr[i].setWeight(Double.parseDouble(Weight));
						}
						isExist = true;
					}
				}
				if(isExist == true) {
					System.out.println(" :: ���������� ���� �Ϸ��Ͽ����ϴ�. ::");
				} else {
					System.out.println(" :: ������ ģ���� ã�� �� �����ϴ�. ::");
				}
			} else if(Select == 5) {
				String search = readStr("������ ģ���� �̸�");
				boolean IsExist = false;
				for(int i = 0 ; i < Friend_Arr.length; i++) {
					if(Friend_Arr[i] != null && Friend_Arr[i].getName().indexOf(search) != -1) {
						IsExist = true;
						Friend_Arr[i] = null;
					}
				}
				if(IsExist == false) {
					System.out.println(" :: ������ ģ���� ã�� �� �����ϴ�. :: ");
				} else {
					System.out.println(" :: ������ ģ���� ���� �Ϸ��Ͽ����ϴ�. :: ");
				}
			} else if(Select == 6) {
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			}
			System.out.println();
		}
	}
	
	public static String readStr(String msg) {
		System.out.print(msg + " ��(��) �Է��ϼ��� : ");
		return Sc.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.print(msg + " ��(��) �Է��ϼ��� : ");
		int result;
		while (true) {
			String val = Sc.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}
	
	public static double readDouble(String msg) {
		System.out.print(msg + " ��(��) �Է��ϼ��� : ");
		double result;
		while (true) {
			String val = Sc.nextLine();
			try {
				result =Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}
	
}
