package date210623.method;

public class Person {
	private int money;
	private int friuts;
	
	public Person(int money, int friuts) {
		this.money = money;
		this.friuts = friuts;
	}
	
	public void buyFriut() {
		if(money <= 0) {
			System.out.println("과일을 살 수 없습니다.");
		}else {
			this.friuts += 1;
			this.money -= 1000;
		}
	}
	
	public void setMoney(int money) {
		this.money = money; 
	}
	
}
