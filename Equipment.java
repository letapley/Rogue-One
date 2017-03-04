
public class Equipment extends Items {

	public static int durability;
	public static boolean cursed;
	public static boolean enchanted;
	public static int bonus;
	public static int damageIncrease;
	
	public Equipment(String name, String typeItem, int durability, boolean cursed, int bonus) {
		super(name, typeItem);
		this.durability = durability;
		this.cursed = cursed;
		this.bonus = bonus;
		if(name.equals("Weapon")){
			damageIncrease = 5;
		}
	}
	
	//returns if item is cursed or not
	protected boolean isCursed() {
		return cursed;
	}
	
	//returns if item is enchanted or not
	protected boolean isEnchanted(){
		return enchanted;
	}
	
	//returns if player is already equiped with an item of the same type
	protected boolean isSlotFull(){
		return false;
		//Todo, find out if slot is full
	}
	
	//returns the bonus of the equipment
	protected int bonus(){
		return bonus;
	}
	
	protected int damageIncrease(){
		return damageIncrease;
	}

}
