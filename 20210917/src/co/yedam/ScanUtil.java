package co.yedam;
import java.util.Scanner;

public class ScanUtil 
{
	/*
	 * 컴파일 과정에서 미리 메모리에 할당.
	 * 인스턴스를 따로 할당하지 않아도 사용 가능.
	 */
	static Scanner Sc = new Scanner(System.in);
	public static int readInt(String msg) {
		System.out.println(msg);
		int Num = Sc.nextInt();
		Sc.nextLine();
		return Num;
	}
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return Sc.nextLine();
	}
}
