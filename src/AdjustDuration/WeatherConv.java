package AdjustDuration;


public class WeatherConv {

	int code;
	WeatherConv(int code){
		//From yahoo weather api
		//code describe the weather condition
		this.code = code;
	}
	
	public Weather GetWeather(){
		switch(code){
		case 0: return Weather.IMPOSSIBLE;
		case 1: return Weather.IMPOSSIBLE;
		case 2: return Weather.IMPOSSIBLE;
		case 3: return Weather.IMPOSSIBLE;
		case 4: return Weather.RAIN;
		case 5: return Weather.SNOW;
		case 6: return Weather.SNOW;
		case 7: return Weather.SNOW;
		case 8: return Weather.DRIZZLE;
		case 9: return Weather.DRIZZLE;
		case 10: return Weather.RAIN;
		case 11: return Weather.RAIN;
		case 12: return Weather.RAIN;
		case 13: return Weather.SNOW;
		case 14: return Weather.SNOW;
		case 15: return Weather.SNOW;
		case 16: return Weather.SNOW;
		case 17: return Weather.SNOW;
		case 18: return Weather.DRY;
		case 19: return Weather.DRY;
		case 20: return Weather.DRY;
		case 21: return Weather.DRY;
		case 22: return Weather.DRY;
		case 23: return Weather.DRY;
		case 24: return Weather.DRY;
		case 25: return Weather.DRY;
		case 26: return Weather.DRY;
		case 27: return Weather.DRY;
		case 28: return Weather.DRY;
		case 29: return Weather.DRY;
		case 30: return Weather.DRY;
		case 31: return Weather.DRY;
		case 32: return Weather.DRY;
		case 33: return Weather.DRY;
		case 34: return Weather.DRY;
		case 35: return Weather.RAIN;
		case 36: return Weather.DRY;
		case 37: return Weather.RAIN;
		case 38: return Weather.RAIN;
		case 39: return Weather.RAIN;
		case 40: return Weather.RAIN;
		case 41: return Weather.SNOW;
		case 42: return Weather.SNOW;
		case 43: return Weather.SNOW;
		case 44: return Weather.DRY;
		case 45: return Weather.RAIN;
		case 46: return Weather.RAIN;
		case 47: return Weather.RAIN;
		case 3700: return Weather.IMPOSSIBLE;
		}
		return Weather.IMPOSSIBLE;
	}
}
