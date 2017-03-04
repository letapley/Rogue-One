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
		this.strength = 0;
	}

	public int fight(int[] dir, char monster, weapon weapon, boolean thrown) {
		// TODO
		int dmg = 4;
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
