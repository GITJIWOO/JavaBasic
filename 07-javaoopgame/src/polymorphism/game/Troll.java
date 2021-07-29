package polymorphism.game;

public class Troll extends Monster {
	
	
	
	
	
	
	
	public Troll() {
		super("트롤",
				35,
				4,
				5);
	}
	public void doBattle(int uAtk) {
			setHp(getHp() + getDef() - uAtk);
			if(getHp() <= 0) {
				System.out.println("트롤 몬스터는 죽었습니다.");
			}
	}

}
