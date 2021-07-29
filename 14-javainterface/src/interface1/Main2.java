package interface1;

public class Main2 {
	public static void main(String[] args) {
		Vehicle v1 = new Train("최종훈");
		int a = 1/0;
		v1.accel();
		v1.showStatus();
		
		Vehicle v2 = new Airplane("고라니");
		v2.accel();
		v2.accel();
		v2.accel();
		v2.showStatus();
		v2.reFuel();
		v2.showStatus();
	}
}
