import java.util.Random;


public class Enemy extends Unit{

	//special ability
	//boolean[] flags
	private int armorClass;
	private int treasureChance;
	private int expGained;
	private int dmg;
	private int gold;
	
	public Enemy(int monsLevel, int monsStr, int monsArm, int monsMaxHP, int monsExp, int gold) {
		this.level = monsLevel;
		this.strength = monsStr;
		this.armor = monsArm;
		this.maxHP = monsMaxHP;
		this.expGained = monsExp;
		this.gold = gold;
	}
	
	public void chase() {
		
	}
	
	public void moveTo() {
		
	}
	
	public void moveRandom() {
		
	}
	
	public int attackPlayer() {
		Random rand = new Random();
		int r = rand.nextInt(this.strength+1);
		return r;
	}
	
	public int removeMonster() {
		if(isDead()) {
			
			return this.expGained;
		}
		return 0;
	}
	
	public int dropTreasure() {
		Random rand = 	new Random();
		int r = rand.nextInt(101);
		if(r == treasureChance) {
			return gold;
		}
		return 0;
	}
}
