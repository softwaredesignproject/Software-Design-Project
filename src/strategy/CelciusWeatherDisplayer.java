package strategy;

import java.util.ArrayList;

import net.sf.json.JSONObject;

import API.WeatherAPI;
import Parser.JSONParserCelciusStrategy;
import user.UserData;

public class CelciusWeatherDisplayer extends WeatherDisplayer{

	@Override
	public String getWeather(UserData data) {
		// TODO Auto-generated method stub
		// insert here logic for CelciusWeatherDisplayer
		
		WeatherAPI test = new WeatherAPI(); 
		System.out.println("C "+data.getEndzipcode());
		String testoutput = test.getWeather(data.getEndzipcode());
		JSONParserCelciusStrategy jsonParse = new JSONParserCelciusStrategy();
		String celciusTemp = jsonParse.parseJson(testoutput);
		System.out.println(celciusTemp);
		return celciusTemp+" C";
	}

}
