package co.yedam;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		int[] Arr = { 1, 2, 3 };
		String[] StrArr = { "Hello", "World" };
		int Num = 10;
		
		Student S1 = new Student();
		S1.Name = "ȫ�浿";
		S1.Score = 80;
		
		Student S2 = new Student();
		S2.Name = "��μ�";
		S2.Score = 90;
		
		System.out.println("S1 �л��� �̸� : " + S1.Name);
		System.out.println("S1 �л��� ���� : " + S1.Score);
		
		Student S3 = new Student();
		S3.Name = "������ ";
		S3.Score = 85;
		
		Student[] StudentArr = { S1, S2, S3 };
		System.out.println("�迭 ù ��° �̸� : " + StudentArr[0].Name);
		System.out.println("�迭 ù ��° ���� : " + StudentArr[0].Score);
		
		System.out.println("�迭 �� ��° �̸� : " + StudentArr[2].Name);
		System.out.println("�迭 �� ��° ���� : " + StudentArr[2].Score);
		
		S1.Name = "�ڱ浿";
		S1.Score = 70;
		
		for(int i = 0 ; i < StudentArr.length; i++) {
			System.out.println("�л��̸� : " + StudentArr[i].Name);
			System.out.println("�л����� : " + StudentArr[i].Score);
		}
	}
}
