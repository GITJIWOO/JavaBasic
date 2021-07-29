package polymorphism.game;

public class Dragon extends Monster{
	
	public Dragon() {
		super("드래곤", 
				50, 
				4, 
				5);
	}
		public void doBattle(int uAtk) {
			setHp(getHp() + getDef() - uAtk);
			if(getHp() <= 0) {
				System.out.println("드래곤 몬스터는 죽었습니다.");
			}
		}
	}

