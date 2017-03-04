
public class Unit {

	int statusTime;
	String statusEffect;
	int level;
	int strength;
	int hp;
	int maxHP;
	int armor;
	String name;
	
	public Unit() {
		// TODO constructor and stuff
	}
	
	public void move(int[] direction) {
		level.move(Player, direction);
	}
	
	public boolean isDead() {
		// TODO write the code and maybe add in an attribute
		if(this.hp == 0) {
			return true;
		}
		return false;
	}
}
