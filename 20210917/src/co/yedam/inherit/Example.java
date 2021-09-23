package co.yedam.inherit;

public class Example 
{
	public static void main(String[] args) 
	{
		People P1 = new People("Hong", "20200101-1234567");
		System.out.println("이름 : " + P1.getName());
		System.out.println("번호 : " + P1.getSsn());
		P1.showInfo();
		System.out.println(P1.toString());
		
		Student S1 = new Student("Park","20210101-1234567");
		System.out.println("이름 : " + S1.getName());
		System.out.println("번호 : " + S1.getSsn());
		S1.showInfo();
		System.out.println(S1.toString());
		
		Student S2 = new Student("Choi","20210202-1234567", 110);
		System.out.println("이름 : " + S2.getName());
		System.out.println("번호 : " + S2.getSsn());
		System.out.println("학생번호 : " + S2.getStudentNo());
		S2.showInfo();
		
		People P2 = new Student("Hwang", "20210303-1234567", 120);
		//P1 = new Student("Hwang", "20210303-1234567", 120);
		
		//Student S3 = new People();
		// P2.getStudentNo();
		
		if(P2 instanceof Student) {
			Student S3 = (Student) P2;
			S3.getStudentNo();
		}
		if(P1 instanceof Student) {
			Student S4 = (Student) P1;
			S4.getStudentNo();
		} else {
			System.out.println("형변환할 수 없습니다.");
		}
	}
}
