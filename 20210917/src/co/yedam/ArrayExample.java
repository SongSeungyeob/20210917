package co.yedam;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		int[] Arr = { 1, 2, 3 };
		String[] StrArr = { "Hello", "World" };
		int Num = 10;
		
		Student S1 = new Student();
		S1.Name = "홍길동";
		S1.Score = 80;
		
		Student S2 = new Student();
		S2.Name = "김민수";
		S2.Score = 90;
		
		System.out.println("S1 학생의 이름 : " + S1.Name);
		System.out.println("S1 학생의 점수 : " + S1.Score);
		
		Student S3 = new Student();
		S3.Name = "최지우 ";
		S3.Score = 85;
		
		Student[] StudentArr = { S1, S2, S3 };
		System.out.println("배열 첫 번째 이름 : " + StudentArr[0].Name);
		System.out.println("배열 첫 번째 점수 : " + StudentArr[0].Score);
		
		System.out.println("배열 세 번째 이름 : " + StudentArr[2].Name);
		System.out.println("배열 세 번째 점수 : " + StudentArr[2].Score);
		
		S1.Name = "박길동";
		S1.Score = 70;
		
		for(int i = 0 ; i < StudentArr.length; i++) {
			System.out.println("학생이름 : " + StudentArr[i].Name);
			System.out.println("학생점수 : " + StudentArr[i].Score);
		}
	}
}
