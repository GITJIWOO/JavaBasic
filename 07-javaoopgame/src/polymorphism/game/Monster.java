package polymorphism.game;

public abstract class Monster {
	
	private String name;
	private int hp;
	private int def;
	private int atk;
	
	public Monster(
			String name, 
			int hp, 
			int def, 
			int atk) {
		this.name = name;
		this.hp = hp;
		this.def = def;
		this.atk = atk;
	}
	
	public abstract void doBattle(int uAtk); //{
		//this.hp = (this.hp + this.def) - uAtk;
		//if(this.hp <= 0) {
		//	System.out.println(name + "몬스터는 죽었습니다.");
		//}
	//}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
}
