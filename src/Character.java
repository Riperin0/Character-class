
public class Character {
	
	String Name, Class;
	int Level;
	Race RCE;
	
	
	
	public Character()
	{
		Name 	= "Default Name";
		RCE 	= new Race();
		Class	= "Default Class";
		Level	= 0;
				
		
	}
	
	public Character(String name, String race, String clss, int lvl) 
	{
		Name = name;
		RCE = new Race(race);
		Class = clss;
		Level = lvl;
		
	}
	
	public void setName(String name) 
	{
		Name = name;		
	}
	
	public void setRace(String race) 
	{
		RCE = new Race(race);
	}
	
	public void setRace(Race rce) 
	{
		RCE = rce;
		
		
		
		
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
	
	public Race getRace() 
	{
		return RCE;
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
		String built = Name + ", " + RCE + ", Level " + Level + " " + Class;
		return built;
	}
	
	

}
