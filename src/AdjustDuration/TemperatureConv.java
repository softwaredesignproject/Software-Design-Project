package AdjustDuration;


public class TemperatureConv {
	double tp;
	TemperatureConv(double tp, String unit){
		//Celsius will be passed in
		if (new String("C").equalsIgnoreCase(unit))
			this.tp = tp;
		else
			this.tp = (5.0/9.0) * (tp - 32);
	}
	
	public Temperature GetWea(){
		if(tp>14.5){
			return Temperature.HIGH;
		}else if(tp>6.1 && tp<14.4){
			return Temperature.MED;
		}else{
			return Temperature.LOW;
		}
	}
}
