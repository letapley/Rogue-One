import java.util.Random;

public class Level {
	
	private String[][] floorSeen;
	private String[][] floorUnits;
	private String[][] floorItems;
	private String[][] floorTraps;
	
	public Level(){
		makeLevel();
	}
	
	public String[][] giveSeenFloor(){
		return floorSeen;
	}
	
	//Small for prototype
	public void makeLevel(){
		this.floorSeen= new String[20][20];
		for(int i=0; i<20;i++){
			for(int k=0; k<20;k++){
				if(i==0 || i==19){
					this.floorSeen[i][k]= "=";
				}else if(k==0 ||k==19){
					this.floorSeen[i][k]="|";
				}else{
					this.floorSeen[i][k]=".";
				}
			}
		}
		addUnit("P");
		addUnit("E");
	}
	
	//makes one room
	private void makeRoom(){
		
	}
	
	//Not implemented in prototype
	private void makeHallway(){	
		
	}
	
	//called by the make level
	private void addUnit(String u){
		
		Random rand = new Random();
		int  tempX = rand.nextInt(this.floorSeen.length);
		int tempY = rand.nextInt(this.floorSeen[0].length);
		
		//look for empty space on a floor
		while(this.floorSeen[tempX][tempY]!="."){
			tempX = rand.nextInt(this.floorSeen.length);
			tempY = rand.nextInt(this.floorSeen[0].length);
		}
		this.floorUnits[tempX][tempY]=u;
		this.floorSeen[tempX][tempY]=u;
	}
	
	public void validMove(){
		
	}
	
	//moves the player in a certain direction
	public void moveUnit(){
	
	}
	
	//called by enemy who dies
	public void removeEnemy(){
		
	}
	
	//checks if player can see trap
	public void seeTrap(){
		
	}
	
	//checks if player can disarm a trap
	public void disarmTrap(){
		
	}
	
	
}
