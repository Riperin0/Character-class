
public class Race {
	
	String RaceName, RaceOrigin;
	
	
	public Race() 
	{
		RaceName = "Default RaceName";
		RaceOrigin = "Default OriginName";
		
	}
	
	public Race(String name) {
		RaceName =name;
		
	}
	
	
	public void setRaceName(String raceName) {
		RaceName = raceName;
	}
	
	public void setRaceOrigin(String raceOrigin) {
		RaceOrigin = raceOrigin;
	}
	
	public String getRaceName() {
		return RaceName;
	}
	
	public String getRaceOrigin() {
		return RaceOrigin;
	}
	
	
	
	
	@Override
	public String toString() {
		
		String built = RaceName;
		
		if(!(RaceOrigin == null)) 
		{
			built += ", " + RaceOrigin;
		}
		
		return built;
	}
	
	
	
	
	
	
	
	

}
