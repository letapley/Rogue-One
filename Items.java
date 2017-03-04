
public class Items {

	private static String name; //name of item
	private static String typeItem; //armor,equipment,ring,food,
	
	public Items(String name, String typeItem){
		this.name = name;
		this.typeItem = typeItem;
	}
	
	//returns name of the item
	protected String showName(){
		return name;
	}
	
	//takes up time to use items
	protected void wasteTime(){
		//Todo
	}
	
	//returns type item
	protected String typeItem(){
		return typeItem;
	}
}
