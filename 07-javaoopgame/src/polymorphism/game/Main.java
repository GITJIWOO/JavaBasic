package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Archer a1 = new Archer();
		Monster o1 = new Orc();
		Monster t1 = new Troll();
		Monster d1 = new Dragon();
		Monster s1 = new Skeleton();
		
		w1.doubleAttack(d1);
		w1.doubleAttack(d1);
		w1.doubleAttack(d1);
		w1.hunt(d1);
		w1.hunt(d1);
		w1.hunt(d1);
		w1.hunt(d1);
		w1.showStatus();
		
		a1.multiShot(s1);
		a1.multiShot(s1);
		a1.multiShot(s1);
		a1.multiShot(s1);
		a1.multiShot(s1);
		a1.multiShot(s1);
		a1.multiShot(s1);

		a1.hunt(s1);a1.hunt(s1);

		a1.showStatus();
	}
}
