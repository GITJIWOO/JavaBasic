package polymorphism.game;

public class Skeleton extends Monster{
	
	public Skeleton() {
		super("스켈레톤", 
				30, 
				6, 
				4);
	}
		public void doBattle(int uAtk) {
			setHp(getHp() + getDef() - uAtk);
			if(getHp() <= 0) {
				System.out.println("스켈레톤 몬스터는 죽었습니다.");
			}
		}
	}

