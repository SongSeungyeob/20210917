package co.yedam.person;

public class PersonExample
{
	public static void main(String[] args) 
	{
		Person P1 = new Person("�۽¿�", 186, 76.8, "A", 28);
		Person P2 = new Person("ȫ�浿", 178.5, 80.3, "AB", 26);
		Person P3 = new Person("��ö��", 164.8, 74.5, "O", 29);
		
		Person[] Family = new Person[3];
		Family[0] = P1;
		Family[1] = P2;
		Family[2] = P3;
		System.out.println("[ Family�� ���� �ִ� ��� Person ��� ]");
		for(int i = 0 ; i < 3; i++) {
			System.out.println("- �̸� : " + Family[i].getName() + ", ������ : " + Family[i].getBlood() + ", ���� : " + Family[i].getAge());
		}
		System.out.println("[ �� 1 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
		
		System.out.println("[ Family ��, Ű�� 165�̻��� Person ��� ]");
		for(int i = 0 ; i < 3; i++) {
			if(Family[i].getHeight() >= 165) {
				System.out.println("- �̸� : " + Family[i].getName() + ", Ű : " + Family[i].getHeight() + ", ������ : " + Family[i].getWeight());
			}
		}
		System.out.println("[ �� 2 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
		
		System.out.println("[ Family ��, �������� AB�� Person ��� ]");
		for(int i = 0 ; i < 3; i++) {
			if(Family[i].getBlood().equals("AB")) {
				System.out.println("- �̸� : " + Family[i].getName() + ", ������ : " + Family[i].getBlood());
			}
		}
		System.out.println("[ �� 3 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
	}
}
