package AdjustDuration;


public class TemperatureConv {
	double tp;
	TemperatureConv(double tp){
		//Celsius will be passed in
		this.tp = tp;
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
