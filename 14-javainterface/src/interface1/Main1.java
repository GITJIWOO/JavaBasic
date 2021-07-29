package interface1;

public class Main1 {
	public static void main(String[] args) {
		// 자동차 생성 및 사용
		// 생성시 Car타입 하나와
		// Vehicle 타입 하나
		// 이렇게 두 종을 만들어서 써보세요.
		Vehicle v1 = new Car("채종훈");
		v1.accel();
		v1.showStatus();
		
		Car c1 = new Car("채종휸");
		c1.breakSpeed();
		c1.showStatus();
	}
}
