package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		// 부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능.
		Person a1 = new Army("김군인", 1, "대장");
		Person s1 = new Student("학학생", 2, 4);
		// 단 메서드는 Person을 베이스 객체는
		// Person에 정의된 메서드만 호출 가능
		a1.showPerson();
		//a1.showArmy();
		s1.showPerson();
		//s1.showStudent();
		
		Person d1 = new Developer("채종훈", 2, "java");
		d1.showPerson();
		
		
	}
}
