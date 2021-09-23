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
////				System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
////				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
////				System.out.print("선택 >> ");
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
////					printResult("정상적으로 종료되었습니다.");
////				} else {
////					System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
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
//		System.out.println("[ 결과 : " + msg + " ]");
//	}
//	
//	private static  void createAccount() {
//		printTool("계좌 생성");
//		for(int i = 0 ; i < accountArray.length; i++) {
//			if(accountArray[i] != null) continue;
//			String Ano =readStr("계좌번호");
//			String Name = readStr("계좌주");
//			int balance = readInt("초기입금액");
//			accountArray[i] = new Account(Ano, Name, balance);
//			printResult("계좌가 생성되었습니다.");
//			break;
//		}
//	}
//	
//	private static void accountList() {
//		printTool("계좌 목록");
//		for(int i = 0 ; i < accountArray.length; i++) {
//			if(accountArray[i] == null) continue;
//			accountArray[i].showAccountInfo();			
//		}
//	}
//	
//	private static void deposit() {
//		printTool("예금");
//		String Ano = readStr("계좌번호");
//		int Balance = readInt("예금액");
//		
//		Account Acc = findAccount(Ano);
//		if(Acc == null) {
//			printResult("일치하는 계좌번호를 찾을 수 없습니다.");
//		} else {
//			Acc.setBalance(Acc.getBalance() + Balance);
//			printResult("예금이 성공되었습니다.");
//		}
//	}
//	
//	private static void withDraw() {
//		printTool("출금");
//		String Ano = readStr("계좌번호");
//		int Balance = readInt("출금액");
//		int Flag = 0;
//		Account Acc = findAccount(Ano);
//		if(Acc == null) {
//			printResult("일치하는 계좌번호를 찾을 수 없습니다.");
//		} else {
//			if(Acc.getBalance() - Balance < 0) {
//				printResult("잔액이 부족하여 입력하신 금액을 출금하실 수 없습니다.");
//			} else {
//				Acc.setBalance(Acc.getBalance( ) - Balance);
//				printResult("출금이 성공되었습니다.");
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
//				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
//			}
//		}
//		return result;
//	}
//}
//
