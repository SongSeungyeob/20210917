package co.yedam;
import java.util.Scanner;

public class ScanUtil 
{
	/*
	 * ������ �������� �̸� �޸𸮿� �Ҵ�.
	 * �ν��Ͻ��� ���� �Ҵ����� �ʾƵ� ��� ����.
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
