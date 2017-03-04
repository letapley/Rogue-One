import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GamePlay {

	
	Items item = new Items();
	boolean hasAmulet=false;
	Unit player; 
	
	String[] lines = new String[10];
		
	
	//should this one really happen here? 
	private void spawnItems(Items contents, Dungeon dungeon) {
		
	}
	
	public void climbStairs() {
		if(hasAmulet==true) {
			
			//dungeon.currLevel--;
			//if (dungeon.currLevel==-1) {
				//View.printVictoryScreen();
			//}
		} else {
			//dungeon.currLevel++;
		}
	}
	
	public boolean checkWin() {
		
		if (hasAmulet==true /*&& dungeon.currLevel==-1*/) {
			return true;
		}
		return false;
	}
	public boolean checkDead(Unit unit) {
		if (unit.health<=0) {
			return true;
		}
		
		/*	 better version, dependent on other code
		if (unit.isDead()==true) {
			return true;
		}
		*/
		return false;
	}
	
	
	//resolves attack. returns 0 if nobody died, 1 if defender died, 2 if attacker died
	public int unitAttack(Unit attacker, Unit defender) {
		defender.health -= calcDmg(attacker);
		
		if (checkDead(defender)==false) {
			attacker.health -= calcDmg(defender);
		} else {
			return 1;
		}
		if (checkDead(attacker) == true) {
			return 2;
		}
		return 0;
	}
	
	public int calcDmg(Unit attacker) {
		int result = 0; 
		result+=attacker.strength; 
		
		return result;
	}
	
	public void help() {
		//View.printControlMenu();
	}
	
	public void option() {
		//View.printOptionMenu();
	}
	
	public void Move() {
		
	}
	
	public void saveGame(String[] test) {
		lines[0]+= "i am testing";
		lines [5] += "all of this a test";
		List<String> thingy = Arrays.asList("Testing testing", "one two three");
		Charset utf8 = StandardCharsets.UTF_8;

		try {
			Files.write(Paths.get("saveGame.txt"), thingy, utf8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test() {
		
	}

	
	public static void main(String[] args) {
		GamePlay what = new GamePlay();
		String[] dyingnoises = new String[4];
		what.saveGame(dyingnoises); 
	}
}

