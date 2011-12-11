package AdjustDuration;


public class DurationAdjustment {

	String temperature;
	String gender;
	String age;
	String groupSize;
	String useWeather;
	String tempUnit;
	
	
	public DurationAdjustment(String gender,String groupSize,String useWeather, String age,String temp,String tempUnit){
		
		this.temperature = temp.substring(0, temp.indexOf(" ")).toLowerCase();
		this.tempUnit = tempUnit.toLowerCase();
		this.gender = gender.toLowerCase();
		this.age = age.toLowerCase();
		this.groupSize = groupSize.toLowerCase();
		this.useWeather = useWeather.toLowerCase();
		
		
	}
	
	public String adjustValue(){
		double genderIndex;
		if(new String("male").equals(gender))genderIndex =1.033;
		else if (new String("female").equals(gender))genderIndex =0.967;
		else genderIndex =1.0;
		
		double groupSizeIndex;
		if (new String("alone").equals(groupSize))groupSizeIndex=1.020;
		else if (new String("withothers").equals(groupSize))groupSizeIndex=0.940;
		else groupSizeIndex = 1.0;
		
		double ageIndex;
		if (new String("old").equals(age))ageIndex=0.828;
		else ageIndex = 1.0;
		
		double tpIndex = 0;
		double weatherIndex;
				
		TemperatureConv tc = new TemperatureConv(Double.valueOf(temperature), tempUnit);
		Temperature tp = tc.GetWea();
		switch(tp){
		case LOW: tpIndex = 1.060; break;
		case MED: tpIndex = 1.013; break;
		case HIGH: tpIndex = 0.980; break;
		}
		
		if (new String("yes").equals(useWeather)) weatherIndex =tpIndex;
		else weatherIndex=1.0;

		return String.valueOf(genderIndex*groupSizeIndex*ageIndex*weatherIndex);
	}
	public static void main(String[] arg){
		DurationAdjustment dA = new DurationAdjustment("female","alone","yes","old","10 C","C");
		System.out.println(dA.adjustValue());
	}
}
