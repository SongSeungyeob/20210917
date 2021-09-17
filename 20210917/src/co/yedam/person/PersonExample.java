package co.yedam.person;

public class PersonExample
{
	public static void main(String[] args) 
	{
		Person P1 = new Person("송승엽", 186, 76.8, "A", 28);
		Person P2 = new Person("홍길동", 178.5, 80.3, "AB", 26);
		Person P3 = new Person("김철수", 164.8, 74.5, "O", 29);
		
		Person[] Family = new Person[3];
		Family[0] = P1;
		Family[1] = P2;
		Family[2] = P3;
		System.out.println("[ Family에 속해 있는 모든 Person 출력 ]");
		for(int i = 0 ; i < 3; i++) {
			System.out.println("- 이름 : " + Family[i].getName() + ", 혈액형 : " + Family[i].getBlood() + ", 나이 : " + Family[i].getAge());
		}
		System.out.println("[ 끝 1 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
		
		System.out.println("[ Family 중, 키가 165이상인 Person 출력 ]");
		for(int i = 0 ; i < 3; i++) {
			if(Family[i].getHeight() >= 165) {
				System.out.println("- 이름 : " + Family[i].getName() + ", 키 : " + Family[i].getHeight() + ", 몸무게 : " + Family[i].getWeight());
			}
		}
		System.out.println("[ 끝 2 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
		
		System.out.println("[ Family 중, 혈액형이 AB인 Person 출력 ]");
		for(int i = 0 ; i < 3; i++) {
			if(Family[i].getBlood().equals("AB")) {
				System.out.println("- 이름 : " + Family[i].getName() + ", 혈액형 : " + Family[i].getBlood());
			}
		}
		System.out.println("[ 끝 3 ] = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
		System.out.println();
	}
}
