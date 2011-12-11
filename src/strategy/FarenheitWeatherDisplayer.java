package strategy;

import API.WeatherAPI;
import Parser.JSONParserFareneheitStrategy;
import user.UserData;

public class FarenheitWeatherDisplayer extends WeatherDisplayer {

	@Override
	public String getWeather(UserData data) {
		// TODO Auto-generated method stub
		// insert here logic for FarenheitWeatherDisplayer
		WeatherAPI test = new WeatherAPI(); 
		System.out.println("F "+data.getEndzipcode());
		String testoutput = test.getWeather(data.getEndzipcode());
		JSONParserFareneheitStrategy jsonParse = new JSONParserFareneheitStrategy();
		String farenheitTemp = jsonParse.parseJson(testoutput);
		System.out.println(farenheitTemp);
		return farenheitTemp+" F";
	}

}
