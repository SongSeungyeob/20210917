package co.yedam.lesson;

public class LessonExample 
{
	public static void main(String[] args) 
	{
		Teacher T1 = new Teacher("ȫ�浿", "����");
		Student S1 = new Student("��ҿ�", "010-1111","�뱸�߱�");
		Student S2 = new Student("������", "010-2222", "�뱸����");
		
		Lesson L1 = new Lesson();
		L1.setTeacher(T1);
		L1.setGroup("3�г� 1��");
		L1.addStudent(S1);
		L1.addStudent(S2);
		
		Teacher T2 = L1.getTeacher();
		System.out.println("������ �̸� : " + T2.getName());
		System.out.println("������ ���� : " + L1.getTeacher().getMajor());
	}
}
