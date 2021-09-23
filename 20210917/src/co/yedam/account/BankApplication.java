//package co.yedam.account;
//import java.util.Scanner;
//
//public class BankApplication 
//{
//	private static Account[] accountArray = new Account[100];
//	private static Scanner Sc = new Scanner(System.in);
//	static int Num = 0;
//	
//	public static void main(String[] args) 
//	{
////			boolean run  = true;
////			while(run) {
////				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
////				System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� ");
////				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
////				System.out.print("���� >> ");
////				
////				int Select = Sc.nextInt(); Sc.nextLine();
////				
////				if(Select == 1) {
////					createAccount();
////				} else if(Select == 2) {
////					accountList();
////				} else if(Select == 3) {
////					deposit();
////				} else if(Select == 4) {
////					withDraw();
////				} else if(Select == 5) {
////					run = false;
////					printResult("���������� ����Ǿ����ϴ�.");
////				} else {
////					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
////				}
////			}
//	}
//	
//	private static void printTool(String msg) {
//		System.out.println("- - - - - - -");
//		System.out.println(msg);
//		System.out.println("- - - - - - -");
//	}
//	
//	public static void printResult(String msg) {
//		System.out.println("[ ��� : " + msg + " ]");
//	}
//	
//	private static  void createAccount() {
//		printTool("���� ����");
//		for(int i = 0 ; i < accountArray.length; i++) {
//			if(accountArray[i] != null) continue;
//			String Ano =readStr("���¹�ȣ");
//			String Name = readStr("������");
//			int balance = readInt("�ʱ��Աݾ�");
//			accountArray[i] = new Account(Ano, Name, balance);
//			printResult("���°� �����Ǿ����ϴ�.");
//			break;
//		}
//	}
//	
//	private static void accountList() {
//		printTool("���� ���");
//		for(int i = 0 ; i < accountArray.length; i++) {
//			if(accountArray[i] == null) continue;
//			accountArray[i].showAccountInfo();			
//		}
//	}
//	
//	private static void deposit() {
//		printTool("����");
//		String Ano = readStr("���¹�ȣ");
//		int Balance = readInt("���ݾ�");
//		
//		Account Acc = findAccount(Ano);
//		if(Acc == null) {
//			printResult("��ġ�ϴ� ���¹�ȣ�� ã�� �� �����ϴ�.");
//		} else {
//			Acc.setBalance(Acc.getBalance() + Balance);
//			printResult("������ �����Ǿ����ϴ�.");
//		}
//	}
//	
//	private static void withDraw() {
//		printTool("���");
//		String Ano = readStr("���¹�ȣ");
//		int Balance = readInt("��ݾ�");
//		int Flag = 0;
//		Account Acc = findAccount(Ano);
//		if(Acc == null) {
//			printResult("��ġ�ϴ� ���¹�ȣ�� ã�� �� �����ϴ�.");
//		} else {
//			if(Acc.getBalance() - Balance < 0) {
//				printResult("�ܾ��� �����Ͽ� �Է��Ͻ� �ݾ��� ����Ͻ� �� �����ϴ�.");
//			} else {
//				Acc.setBalance(Acc.getBalance( ) - Balance);
//				printResult("����� �����Ǿ����ϴ�.");
//			}
//		}
//	}
//	
//	private static Account findAccount(String ano) {
//		for(int i = 0 ; i< accountArray.length; i++) {
//			if(accountArray[i] == null) continue;
//			if(accountArray[i].getAno().equals(ano)) {
//				return accountArray[i];
//			}
//		}
//		return null;
//	}
//	
//	public static String readStr(String msg) {
//		System.out.print(msg + " : ");
//		String Str = Sc.nextLine();
//		return Str;
//	}
//	
//	public static int readInt(String msg) {
//		System.out.print(msg + " : ");
//		int result;
//		while (true) {
//			String val = Sc.nextLine();
//			try {
//				result = Integer.parseInt(val);
//				break;
//			} catch (Exception e) {
//				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
//			}
//		}
//		return result;
//	}
//}
//
