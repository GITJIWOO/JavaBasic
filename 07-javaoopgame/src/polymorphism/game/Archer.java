package polymorphism.game;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	
	public Archer(){
		this.hp = 100;
		this.mp = 50;
		this.atk = 8;
		this.def = 1;
		this.lv = 1;
		this.exp = 0;
	}
	// 몬스터 모든 종류를 공격하는 공격 메서드
	public void multiShot(Monster monster) {
		System.out.println("궁수가 멀티샷을 준비합니다.");
		if(mp < 5) {
			System.out.println("마나가 부족합니다.");
			return;
		}
		
		// 공격 전에 먼저 몬스터의 체력을 체크해서 죽은 몬스터라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은" + monster.getName() + 
					"몬스터를 공격할 수 없습니다.");
			return;
		}
		// 멀티샷은 두 번 때립니다.(방어력 적용을 두 번 받음)
		monster.doBattle(this.atk);
		monster.doBattle(this.atk);
		//마나를 추가로 깎습니다.
		mp = mp - 5;
		// 몬스터 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if(monster.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 몬스터가 죽었다면 경험치를 획득
		if(monster.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
			System.out.println(monster.getName() + "교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - monster.getAtk();
		System.out.println(monster.getName() + "교전 완료!");
		
	}
	// 몬스터 모든 종류를 공격하는 공격 메서드
	public void hunt(Monster monster) {
		// 공격 전에 먼저 몬스터의 체력을 체크해서 죽은 몬스터라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은" + monster.getName() + 
					"몬스터를 공격할 수 없습니다.");
			return;
		}
		// 몬스터와 전투를 할 때는 자신의 공격력을 넘깁니다.
		monster.doBattle(this.atk);
		// 몬스터 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if(monster.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 몬스터가 죽었다면 경험치를 획득
		if(monster.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
			System.out.println(monster.getName() + "교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.def) - monster.getAtk();
		System.out.println(monster.getName() + "교전 완료!");
		
	}	
	
	public void showStatus() {
		System.out.println("<<궁수의 상태입니다.>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("레벨 : " + this.lv);
		System.out.println("경험치 : " + this.exp);
	}
}
