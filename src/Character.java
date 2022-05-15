
public class Character {
	
	String Name, Race, Class;
	int Level;
	
	
	
	public Character()
	{
		Name 	= "Default Name";
		Race 	= "Default Race";
		Class	= "Default Class";
		Level	= 0;
				
		
	}
	
	public Character(String name, String race, String clss, int lvl) 
	{
		Name = name;
		Race = race;
		Class = clss;
		Level = lvl;
		
	}
	
	public void setName(String name) 
	{
		Name = name;		
	}
	
	public void setRace(String race) 
	{
		Race = race;
	}
	
	public void setclss(String clss) 
	{
		Class = clss;
	}
	
	public void setlvl(int lvl) 
	{
		Level = lvl;
	}
	
	
	
	public String getName() 
	{
		return Name;
	}
	
	public String getRace() 
	{
		return Race;
	}
	
	public String getClss() 
	{
		return Class;
	}
	
	public int getLevel() 
	{
		return Level;
	}
		
	
	@Override
	public String toString() {
		String built = Name + ", " + Race + ", Level " + Level + " " + Class;
		return built;
	}
	
	

}
