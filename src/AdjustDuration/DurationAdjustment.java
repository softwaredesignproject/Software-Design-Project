package AdjustDuration;


public class DurationAdjustment {

	String temperature;
	String gender;
	String groupSize;
	Gender g;
	GroupSize gS;
	Temperature tp;
	Weather wth;
	Weekday wd;
	Wind w;
	double baseDuration;
	
	public DurationAdjustment(String gender, String groupSize){
		
		this.temperature = temperature;
		this.gender = gender;
		this.groupSize = groupSize;
		if(gender.equalsIgnoreCase("Male"))
		{
			this.g = g.MALE;
		}
		else
		{
			this.g = g.FEMALE;
		}
		if(groupSize.equalsIgnoreCase("alone"))
		{
			this.gS = gS.ALONE;
		}
		else
		{
			this.gS = gS.GROUP;
		}
		
	}
	
	public double GetDuration(double baseDuration){
		double genderIndex = ((g == Gender.FEMALE)?1.033:0.967);
		double groupSizeIndex = ((gS == GroupSize.ALONE)?1.020:0.940);
		double tpIndex = 0;
		switch(tp){
		case LOW: tpIndex = 1.060; break;
		case MED: tpIndex = 1.013; break;
		case HIGH: tpIndex = 0.980; break;
		}
		double weekDayIndex=0;
		switch(wd){
			case MON: weekDayIndex = 0.987; break;
			case TUE: weekDayIndex = 0.993; break;
			case WED: weekDayIndex = 0.987; break;
			case THU: weekDayIndex = 0.993; break;
			case FRI: weekDayIndex = 1.040; break;
			case OTHERS: weekDayIndex = 1.0; break;
		}
		double weatherIndex = 0;
		switch(wth){
			case DRY: weatherIndex = 0.974; break;
			case DRIZZLE: weatherIndex = 1.007; break;
			case RAIN: weatherIndex = 1.060; break;
			case SNOW: weatherIndex = 1.060; break;
			case IMPOSSIBLE: weatherIndex = 0; break;
		}
		double windIndex = 0;
		switch(w){
			case LOW: windIndex = 1.026;break;
			case MED: windIndex = 1.040;break;
			case HIGH: windIndex = 1.033; break;
		}
		
		return baseDuration*genderIndex*groupSizeIndex;
	}
}
