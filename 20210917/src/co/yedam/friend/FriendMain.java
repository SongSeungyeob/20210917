package co.yedam.friend;
import java.util.Scanner;
/*
 * 친구 주소록 관리.
 * 1. 친구 등록 2. 친구 정보 수정 3. 친구 목록 4. 친구 목록 조회 5. 친구 삭제 9. 종료
 * 친구의 정보 : 이름(Str) , 연락처(Str) , email(Str) , 키(double) , 몸무게(double) 
 */

public class FriendMain 
{
	static Scanner Sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Friend[] Friend_Arr = new Friend[100];
		
		while(true) {
			System.out.printf("[ 작업을 선택하세요. ] = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n");
			System.out.print("1. 등록 2. 조회 3. 목록 4. 수정 5. 삭제 6. 종료");
			int Select = readInt(" 중 원하는 메뉴");
			if(Select == 1) {
				System.out.printf("[ 친구 등록 ] 을 선택하셨습니다.\n");
				String Name = readStr("이름");
				String Phone = readStr("연락처"); 
				String Email = readStr("E-Mail");
				double Height = readDouble("키");
				double Weight = readDouble("몸무게");
				Friend New_Friend = new Friend(Name, Phone, Email, Height, Weight);
				for(int i = 0 ; i <Friend_Arr.length; i++) {
					if(Friend_Arr[i] == null) {
						Friend_Arr[i] = New_Friend;
						break;
					}
				}
				System.out.println("[ 친구 등록 ] 에 성공하셨습니다. ");
			} else if(Select == 2) {
				System.out.println("[ 친구 조회 ] 를 선택하셨습니다.");
				String Name = readStr("조회할 친구의 이름");
				System.out.println("[ 조회 결과 ] .... ");
				boolean IsExist = false;
				for(int i = 0 ; i < Friend_Arr.length; i++) {
					if(Friend_Arr[i] != null && Friend_Arr[i].getName().indexOf(Name) != -1) {
						IsExist = true;
						Friend_Arr[i].showFriendInfo();
					}
				}
				if(IsExist == false) {
					System.out.println(" :: 조건에 만족하는 친구가 없습니다 ::");
				} else {
					System.out.println(" :: 조건에 만족하는 친구 리스트 입니다.");
				}
			} else if(Select == 3) {
				System.out.println("[ 친구 목록 출력 ] 을 선택하셨습니다.");
				for(int i = 0 ; i< Friend_Arr.length; i++) {
					if(Friend_Arr[i] == null) continue;
					Friend_Arr[i].showFriendInfo();
				}
			} else if(Select == 4) {
				System.out.println("[ 친구 수정 ] 을 선택하셨습니다.");
				String Name = readStr("수정할 친구의 이름");
				String Phone = readStr(" (입력을 원치 않을 경우, 'Enter'를 누르세요) 수정할 친구의 번호");
				String Email = readStr(" (입력을 원치 않을 경우, 'Enter'를 누르세요) 수정할 친구의 E-Mail");
				String Height = readStr(" (입력을 원치 않을 경우, 'Enter'를 누르세요) 수정할 친구의 키");
				String Weight = readStr(" (입력을 원치 않을 경우, 'Enter'를 누르세요) 수정할 친구의 몸무게");
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
					System.out.println(" :: 정상적으로 수정 완료하였습니다. ::");
				} else {
					System.out.println(" :: 수정할 친구를 찾을 수 없습니다. ::");
				}
			} else if(Select == 5) {
				String search = readStr("삭제할 친구의 이름");
				boolean IsExist = false;
				for(int i = 0 ; i < Friend_Arr.length; i++) {
					if(Friend_Arr[i] != null && Friend_Arr[i].getName().indexOf(search) != -1) {
						IsExist = true;
						Friend_Arr[i] = null;
					}
				}
				if(IsExist == false) {
					System.out.println(" :: 삭제할 친구를 찾을 수 없습니다. :: ");
				} else {
					System.out.println(" :: 삭제할 친구를 삭제 완료하였습니다. :: ");
				}
			} else if(Select == 6) {
				System.out.println("종료하겠습니다.");
				break;
			}
			System.out.println();
		}
	}
	
	public static String readStr(String msg) {
		System.out.print(msg + " 을(를) 입력하세요 : ");
		return Sc.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.print(msg + " 을(를) 입력하세요 : ");
		int result;
		while (true) {
			String val = Sc.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
	
	public static double readDouble(String msg) {
		System.out.print(msg + " 을(를) 입력하세요 : ");
		double result;
		while (true) {
			String val = Sc.nextLine();
			try {
				result =Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
	
}
