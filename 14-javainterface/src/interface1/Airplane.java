package interface1;

public class Airplane implements Vehicle {
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = AIRPLANE_MAX_GAS;
	}

	@Override
	public void accel() {
		if(speed + 300 > 900) {
			speed = 900;
		} else {
			speed += 300;
		}
		gas -= 80;
	}

	@Override
	public void breakSpeed() {
		if(speed - 300 < 0) {
			speed = 0;
		} else {
			speed -= 300;
		}
	}

	@Override
	public void reFuel() {
		if(gas + 600 > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS;
		} else {
			gas += 600;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 비행 속도 : " + speed);
		System.out.println("현재 기내 연료 : " + gas);
		System.out.println("현재 조종사 : " + name);
		System.out.println("--------------------");
		
	}

}
