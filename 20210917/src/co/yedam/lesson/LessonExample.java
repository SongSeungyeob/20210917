package co.yedam.lesson;

public class LessonExample 
{
	public static void main(String[] args) 
	{
		Teacher T1 = new Teacher("홍길동", "국사");
		Student S1 = new Student("김소영", "010-1111","대구중구");
		Student S2 = new Student("정혜윤", "010-2222", "대구서구");
		
		Lesson L1 = new Lesson();
		L1.setTeacher(T1);
		L1.setGroup("3학년 1반");
		L1.addStudent(S1);
		L1.addStudent(S2);
		
		Teacher T2 = L1.getTeacher();
		System.out.println("선생님 이름 : " + T2.getName());
		System.out.println("선생님 과목 : " + L1.getTeacher().getMajor());
	}
}
