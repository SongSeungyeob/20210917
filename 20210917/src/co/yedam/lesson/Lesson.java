package co.yedam.lesson;

public class Lesson 
{
	private Teacher teacher;
	private String group;
	private Student[] Students;
	
	public Lesson() {
		Students = new Student[3];
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void addStudent(Student student) {
		for(int i = 0 ; i < Students.length; i++) {
			if(Students[i] == null) {
				Students[i] = student;
				break;
			}
		}
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public String getGroup() {
		return this.group;
	}
	
	public void showStudents() {
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] != null) {
				System.out.println("�̸� : " + Students[i].getStudentName() + " ����ó : " + Students[i].getPhone()
						+ " �ּ� : " + Students[i].getAddress());
			}
		}
	}
}
