package casting;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	// cat 행동에 해당하는 메서드를 추가해주세요.
	public void haAk() {
		System.out.println("하악질 중입니다.");
	}
	
	// sit은 오버라이딩 해주세요
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}

}
