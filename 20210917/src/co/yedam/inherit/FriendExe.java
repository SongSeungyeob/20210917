package co.yedam.inherit;
import co.yedam.ScanUtil;

public class FriendExe  
{
	// 친구 , 학교친구 , 회사친구 => 배열에 저장.
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
		
		friends[0] = new Friend("홍길동", "1111-1211");
		friends[1] = new Friend("김길동", "2222-1211");
		friends[2] = new Friend("홍수아", "2222-1311");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부");
		friends[5] = new Friend("홍길동", "1111-1234");
		
		while(true) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("1.등록 2. 조회 3. 수정 4. 삭제 5. 종료");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
			
			int Menu = ScanUtil.readInt("메뉴를 선택하세요. ");
			
			if(Menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if(Menu == 2) {
				System.out.println("조회");
				showList();
			} else if(Menu == 3) {
				System.out.println("수정");
				modify();
			} else if(Menu == 4) {
				System.out.println("삭제");
				remove();
			} else if(Menu == 5) {
				System.out.println("[ 종료 하겠습니다. ]");
				break;
			} 
		}
		System.out.println("# 프로그램 종료 #");
	}
	
	private void remove() {
		System.out.println("[ 친구목록 ]= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) continue;
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		int Select = ScanUtil.readInt("삭제할 친구의 번호를 선택하세요.");
		if(friends[Select] == null) {
			System.out.println("※ 삭제할 친구 정보가 존재하지 않습니다. ※");
			System.out.println("[ 삭제에 실패하였습니다. ]");
		} else {
			friends[Select] = null;
			System.out.println("[ 삭제를 완료하였습니다. ]");
		}
		
	}
	
	private void modify() {
		System.out.println("[ 친구목록 ]= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) continue;
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		
		int Select = ScanUtil.readInt("수정할 친구의 번호를 선택하세요.");
		String Phone = ScanUtil.readStr("바꿀 번호를 입력하세요.");
		if(Phone.equals("")) {
			System.out.println("[ 전화번호는 수정하지 않으셨습니다. ]");
		} else {
			friends[Select].setPhone(Phone);
			System.out.println("[ 전화번호를 수정하셨습니다. ]");
		}
		
		if(friends[Select] instanceof UnivFriend) {
			String Major = ScanUtil.readStr("바꿀 전공을 입력하세요.");
			if (Major.equals("") == false) {
				((UnivFriend) friends[Select]).setMajor(Major);
				System.out.println("[ 전공을 수정하셨습니다. ]");
			} else {
				System.out.println("[ 전공을 수정하지 않으셨습니다. ]");
			}
		} else if(friends[Select] instanceof CompFriend) {
			String Depart = ScanUtil.readStr("바꿀 부서를 입력하세요.");
			if (Depart.equals("") == false) {
				((CompFriend) friends[Select]).setDepart(Depart);
				System.out.println("[ 부서를 수정하셨습니다. ]");
			} else {
				System.out.println("[ 부서를 수정하지 않으셨습니다. ]");
			}
		}
		System.out.println("[ 수정을 완료하였습니다. ]");
	}
	
	private void showList() {
		/*
		 * 이름 & 연락처를 입력 => 
		 * 홍길동, 김길동 -> '길동'을 검색하면 홍길동 김길동 모두 나오도록.
		 * 1111-1211 , 2222-1211 -> '1211'로 조회를 하면 '1211'이 들어있는 모든 값들이 다 나오도록.
		 * 길동 , 1211 -> 이름 중에 '길동'이 들어가고, 연락처에 '1211'이 들어가는 사람 출력
		 */
		boolean Name_Flag, Phone_Flag;
		Name_Flag = Phone_Flag = false;
		String Name, Phone;
		Name = ScanUtil.readStr("찾고자 하는 이름을 입력하세요. [ 입력을 원하지 않으면 '엔터'를 누르세요 ]");
		Phone = ScanUtil.readStr("찾고자 하는 폰번호를 입력하세요. [ 입력을 원하지 않으면 '엔터'를 누르세요 ]");
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
			System.out.println("[ 찾으시는 친구 정보와 일치하는 결과가 없습니다. ]");
		} else {
			System.out.println("[ 찾으시는 친구에 대한 결과입니다. ]");
		}
	}
	
	private void addFriend()	{
		/*
		 * 그냥 친구를 등록할지, 학교친구를 등록할지, 회사친구를 등록할지 ??
		 * 1. 그냥친구 = 이름 / 연락처
		 * 2. 학교친구 = 이름 / 연락처 / 전공
		 * 3. 회사친구 = 이름 / 연락처 / 부서명
		 */
		System.out.println("1. 친구 2. 학교친구 3. 회사친구");
		int Choice = ScanUtil.readInt("등록할 친구를 선택하세요.");
		
		String Name = ScanUtil.readStr("친구 이름을 입력하세요.");
		String Phone = ScanUtil.readStr("연락처를 입력하세요.");
		Friend friend = null;
		if(Choice == 1) {
			friend = new Friend(Name, Phone);
		} else if(Choice == 2) {
			String Major = ScanUtil.readStr("전공을 입력하세요.");
			friend = new UnivFriend(Name, Phone, Major);
		} else if(Choice == 3) {
			String Depart = ScanUtil.readStr("부서를 입력하세요.");
			friend = new CompFriend(Name, Phone, Depart);
		}
		
		for(int i = 0 ; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("[ 친구 등록을 성공하였습니다. ]");
	}
}
