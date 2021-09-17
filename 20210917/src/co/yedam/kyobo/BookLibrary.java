package co.yedam.kyobo;
import java.util.Scanner;
/* 1. 도서등록 2. 도서 수정 3. 도서목록 4. 도서조회 5. 도서삭제 9. 종료 
 * 도서정보 : 도서 제목 / 저자 / 출판사 / 가격
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
		kyoboLib[0] = new Book("혼자 공부하는 자바", "신용권","한빛출판사",25000);
		kyoboLib[1] = new Book("이것이 자바다", "신용권", "한빛출판사", 20000);
		kyoboLib[2] = new Book("혼자 공부하는 도둑질", "홍길동", "우리출판사", 25000);

		while(true) {
			System.out.println("1. 도서등록 2. 도서수정 3. 도서목록 4. 도서조회 5. 도서삭제 9. 종료");
			int menu = readInt("메뉴를 선택하세요 >> ");
			if(menu == 1) {
				System.out.println("도서 등록 메뉴입니다. ");
				String title = readStr("책 제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요.");
				int price = readInt("가격을 입력하세요.");
				Book Boo = new Book(title, auth, press, price);
				for(int i = 0 ; i < kyoboLib.length; i++) {
					if(kyoboLib[i] == null) {
						kyoboLib[i] = Boo;
						break;
					}
				}
				System.out.println("저장완료");
			} else if(menu == 2) {
				System.out.println("도서 수정 메뉴입니다. ");
				String search = readStr("수정할 도서명을 입력하세요. ");
				String author = readStr("변경할 저자를 입력 [변경 하지 않을 시, 엔터를 입력].");
				String press = readStr("변경할 출판사를 입력[변경 하지 않을 시, 엔터를 입력].");
				String price = readStr("변경할 금액을 입력[변경 하지 않을 시, 엔터를 입력].");
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
					System.out.println("정상적으로 수정.");
				} else {
					System.out.println("책을 찾을 수 없습니다.");
				}
			} else if(menu == 3) {
				System.out.println("도서 목록 메뉴입니다. ");
				for(Book book : kyoboLib) {
					if(book == null) continue;
					book.showInfo();
				}
			} else if(menu == 4) {
				System.out.println("도서 조회 메뉴입니다. ");
				String search = readStr("조회할 도서명을 입력하세요. ");
				for(Book book : kyoboLib) {
					if(book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}
			} else if(menu == 5) {
				System.out.println("도서 삭제 메뉴입니다. ");
				String search = readStr("삭제할 도서명을 입력하세요. ");
				for(int i = 0 ; i < kyoboLib.length; i++) {
					if(kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				System.out.println("삭제완료");
			} else if(menu == 9) {
				System.out.println("종료 하겠습니다.");
				break;
			}
		} // end of while
		System.out.println("# 끝 #");
	}
	
	// readStr() = 사용자의 입력값을 사용자에게 반환해주는 Method.
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
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
}
