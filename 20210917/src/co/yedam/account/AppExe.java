package co.yedam.account;

public class AppExe 
{
	public static void main(String[] args) 
	{
		AppMain main = AppMain.getInstance();
		main.execute();
		
//		AppMain main2 = AppMain.getInstance();
//		
//		if(main == main2) {
//			System.out.println("같은 값.");
//		} else {
//			System.out.println("다른 값.");
//		}
	}
}
