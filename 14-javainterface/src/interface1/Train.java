package interface1;

public class Train implements Vehicle {
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = MAX_GAS;
	}

	@Override
	public void accel() {
		if(speed + 50 > 300) {
			speed = 300;
		} else {
			speed += 50;
		}
		gas -= 5;
	}

	@Override
	public void breakSpeed() {
		if(speed - 50 < 0) {
			speed = 0;
		} else {
			speed -= 50;
		}
	}

	@Override
	public void reFuel() {
		if(gas + 70 > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += 70;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 열차 속도 : " + speed);
		System.out.println("현재 열차 연료 : " + gas);
		System.out.println("현재 운전수 : " + name);
		System.out.println("--------------------");
		
	}

}
