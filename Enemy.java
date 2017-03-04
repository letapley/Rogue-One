import java.util.Random;


public class Enemy extends Unit{

	//special ability
	//boolean[] flags
	private int armorClass;
	private int treasureChance;
	private int expGained;
	private int dmg;
	
	public Enemy(int monsLevel) {
		this.level = monsLevel;
	}
	
	public void chase() {
		
	}
	
	public void moveTo() {
		
	}
	
	public void moveRandom() {
		
	}
	
	public int attackPlayer() {
		
	}
	
	public void removeMonster() {
		if(hp <= 0) {
			
		}
	}
	
	public void dropTreasure() {
		Random rand = 	new Random();
		int r = rand.nextInt(101);
		if(r == treasureChance) {
			
		}
	}
}
