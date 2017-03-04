
public class Player extends Unit{
	
	private String curArmor;
	private String curWeapon;
	private int curRings;
	private int gold;
	private int maxHP;	//don't need this
	private int exp;
	private int maxExp;
	private int hunger;
	private Inventory inventory;
	
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public int fight(direction dir, char monster, weapon weapon, boolean thrown) {
		// TODO
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
