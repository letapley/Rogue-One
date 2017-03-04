import java.util.Random;


public class Enemy extends Unit{

	//special ability
	//boolean[] flags
	private int armorClass;
	private int treasureChance;
	private int expGained;
	private int dmg;
	
	public Enemy(int monsLevel, int monsStr, int monsArm, int monsMaxHP, int monsExp) {
		this.level = monsLevel;
		this.strength = monsStr;
		this.armor = monsArm;
		this.maxHP = monsMaxHP;
		this.expGained = monsExp;
	}
	
	public void chase() {
		
	}
	
	public void moveTo() {
		
	}
	
	public void moveRandom() {
		
	}
	
	public int attackPlayer() {
		
	}
	
	public int removeMonster() {
		if(isDead()) {
			
			return this.expGained;
		}
		return 0;
	}
	
	public void dropTreasure() {
		Random rand = 	new Random();
		int r = rand.nextInt(101);
		if(r == treasureChance) {
			
		}
	}
}
