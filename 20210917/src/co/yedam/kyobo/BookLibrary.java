package co.yedam.kyobo;
import java.util.Scanner;
/* 1. ������� 2. ���� ���� 3. ������� 4. ������ȸ 5. �������� 9. ���� 
 * �������� : ���� ���� / ���� / ���ǻ� / ����
 * */
public class BookLibrary 
{
	static Scanner Sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
//		String A = Sc.nextLine();
//		if(A.equals("")) {
//			System.out.println("@");
//		}
//		else System.out.println("#");
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("ȥ�� �����ϴ� �ڹ�", "�ſ��","�Ѻ����ǻ�",25000);
		kyoboLib[1] = new Book("�̰��� �ڹٴ�", "�ſ��", "�Ѻ����ǻ�", 20000);
		kyoboLib[2] = new Book("ȥ�� �����ϴ� ������", "ȫ�浿", "�츮���ǻ�", 25000);

		while(true) {
			System.out.println("1. ������� 2. �������� 3. ������� 4. ������ȸ 5. �������� 9. ����");
			int menu = readInt("�޴��� �����ϼ��� >> ");
			if(menu == 1) {
				System.out.println("���� ��� �޴��Դϴ�. ");
				String title = readStr("å ������ �Է��ϼ���.");
				String auth = readStr("���ڸ� �Է��ϼ���.");
				String press = readStr("���ǻ縦 �Է��ϼ���.");
				int price = readInt("������ �Է��ϼ���.");
				Book Boo = new Book(title, auth, press, price);
				for(int i = 0 ; i < kyoboLib.length; i++) {
					if(kyoboLib[i] == null) {
						kyoboLib[i] = Boo;
						break;
					}
				}
				System.out.println("����Ϸ�");
			} else if(menu == 2) {
				System.out.println("���� ���� �޴��Դϴ�. ");
				String search = readStr("������ �������� �Է��ϼ���. ");
				String author = readStr("������ ���ڸ� �Է� [���� ���� ���� ��, ���͸� �Է�].");
				String press = readStr("������ ���ǻ縦 �Է�[���� ���� ���� ��, ���͸� �Է�].");
				String price = readStr("������ �ݾ��� �Է�[���� ���� ���� ��, ���͸� �Է�].");
				boolean isExist = false;
				for(int i = 0 ; i < kyoboLib.length; i++) {
					if(kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if(author.equals("") == false) {
							kyoboLib[i].setAuthor(author);
						}
						if(press.equals("") == false) {
							kyoboLib[i].setPress(press);
						}
						if(price.equals("") == false) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExist = true;
					}
				}
				if(isExist == true) {
					System.out.println("���������� ����.");
				} else {
					System.out.println("å�� ã�� �� �����ϴ�.");
				}
			} else if(menu == 3) {
				System.out.println("���� ��� �޴��Դϴ�. ");
				for(Book book : kyoboLib) {
					if(book == null) continue;
					book.showInfo();
				}
			} else if(menu == 4) {
				System.out.println("���� ��ȸ �޴��Դϴ�. ");
				String search = readStr("��ȸ�� �������� �Է��ϼ���. ");
				for(Book book : kyoboLib) {
					if(book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}
			} else if(menu == 5) {
				System.out.println("���� ���� �޴��Դϴ�. ");
				String search = readStr("������ �������� �Է��ϼ���. ");
				for(int i = 0 ; i < kyoboLib.length; i++) {
					if(kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				System.out.println("�����Ϸ�");
			} else if(menu == 9) {
				System.out.println("���� �ϰڽ��ϴ�.");
				break;
			}
		} // end of while
		System.out.println("# �� #");
	}
	
	// readStr() = ������� �Է°��� ����ڿ��� ��ȯ���ִ� Method.
	public static String readStr(String msg) {
		System.out.println(msg);
		return Sc.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
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
}
