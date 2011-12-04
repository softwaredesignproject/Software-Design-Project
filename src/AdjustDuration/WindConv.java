package AdjustDuration;


public class WindConv {

	double wp;
	
	WindConv(double wp){
		//unit in mpg
		this.wp = wp;
	}
	
	public Wind GetWind(){
		if(wp>=0 && wp<5){
			return Wind.LOW;
		}else if(wp>=5 && wp<10){
			return Wind.MED;
		}else{
			return Wind.HIGH;
		}
	}
}
