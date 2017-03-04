import java.util.Random;

public class Player extends Unit{
	
	private armor curArmor;
	private weapon curWeapon;
	private int curRings;
	private int gold;
	private int maxHP;	//don't need this
	private int exp;
	private int maxExp;
	private int hunger;
	private Inventory inventory;
	
	
	
	public Player() {
		// TODO Auto-generated constructor stub
		this.level = 1;
		this.strength = 10;
		this.armor = 2;
		this.gold = 0;
		this.exp = 0;
		this.maxExp = 10;
		this.hunger = 5;
		this.maxHP = this.hp = 16;
		this.name = "@";
	}

	public int fight(int[] dir, char monster, weapon weapon, boolean thrown) {
		// TODO
		int dmg = this.strength;
		if(curWeapon!=null){
			dmg += curWeapon.damageIncrease();
		}
		Random rand = new Random();
		int r = rand.nextInt(dmg+1);
		return r;
	}
	
	public void checkLevelUp() {
		if(exp >= maxExp) {
			level++;
			exp -= maxExp;
			maxExp += 10;	//change this later`
			System.out.println("Level up!");
		}
	}
	
	public void checkHunger() {
		
	}
}
