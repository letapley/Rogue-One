import java.util.Random;

public class Level {
	
	private String[][] floorSeen;
	private Unit[][] floorUnits;
	private String[][] floorItems;
	private String[][] floorTraps;
	
	public Level(Unit player){
		makeLevel();
		
		floorUnits= new Unit[20][20];
		floorItems= new String[20][20];
		
		Enemy e= new Enemy();
		addUnit(player);
		addUnit(e);
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
	}
	
	//makes one room
	private void makeRoom(){
		//TODO
	}
	
	//Not implemented in prototype
	private void makeHallway(){	
		//TODO
	}
	
	//adds a unit to the level
	private void addUnit(Unit u){
		
		Random rand = new Random();
		int  tempX = rand.nextInt(this.floorSeen.length);
		int tempY = rand.nextInt(this.floorSeen[0].length);
		
		//look for empty space on a floor
		while(this.floorSeen[tempX][tempY]!="."){
			tempX = rand.nextInt(this.floorSeen.length);
			tempY = rand.nextInt(this.floorSeen[0].length);
		}
		this.floorUnits[tempX][tempY]=u;
		this.floorSeen[tempX][tempY]=u.toString();
	}
	
	//checks if a move is valid or not
	private boolean validMove(Unit u, int[] dir){
		
		int[] location= unitLocation(u);
		
		//if out of bound
		if(location[0]+dir[0]<0 || 
		   location[0]+dir[0]>(floorUnits.length-1)||
		   location[1]+dir[1]<0 ||
		   location[1]+dir[1]>(floorUnits[0].length-1)){
			return false;
		}else{
			//check if piece of floor
			if(floorSeen[location[0]+dir[0]][location[1]+dir[1]].equals(".")){
				return true;
			}
		}
		
		return false;
	}
	
	private int[] unitLocation(Unit u){	
		int[] temp= new int[2];
		
		for(int i=0; i<floorUnits.length;i++){
			for(int k=0; k<floorUnits.length;k++){
				if(u.equals(floorUnits[i][k])){
					temp[0]=i;
					temp[1]=k;
				}
			}
		}	
		return temp;
	}
	
	//moves the player in a certain direction
	public boolean moveUnit(Unit u, int[] dir){
		int[] location= unitLocation(u);
		
		if(validMove(u, dir)){
			//make previous location clear
			floorSeen[location[0]][location[1]]= ".";
			floorUnits[location[0]][location[1]]= null;
			//add units to current location
			floorSeen[location[0]+dir[0]][location[1]+dir[1]]=u.toString();
			floorUnits[location[0]+dir[0]][location[1]+dir[1]]= u;
			return true;
		}
		
		return false;
	}
	
	//called by enemy who dies
	public void removeUnit(Unit u){
		//TODO
	}
	
	//checks if player can see trap
	public void seeTrap(){
		//TODO
	}
	
	//checks if player can disarm a trap
	public void disarmTrap(){
		//TODO
	}
	
}

