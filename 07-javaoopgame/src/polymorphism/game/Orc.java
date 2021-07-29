package polymorphism.game;

public class Orc extends Monster{
	
	
	
	
	
	
	public Orc() {
		super("오크", 
				20, 
				1, 
				3);
	}
		public void doBattle(int uAtk) {
			setHp(getHp() + getDef() - uAtk);
			if(getHp() <= 0) {
				System.out.println("오크 몬스터는 죽었습니다.");
			}
		}
	}

