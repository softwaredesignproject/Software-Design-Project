package controller;

import java.util.ArrayList;

import strategy.RouteDisplayer;
import strategy.WeatherDisplayer;
import user.UserData;
import factory.TripFactory;

//Client for Abstract Factory
public class RouteWeatherProcessor {

	//Calling abstract factory
	private WeatherDisplayer weatherDisplayer;
	private RouteDisplayer routeDisplayer;
	String strRouteDetails="";
	String strWeatherValue="";
	String[] strBothDetails = new String[2];
	
	public RouteWeatherProcessor(TripFactory factory)
	{
		weatherDisplayer = factory.createWeatherDisplayer();
		routeDisplayer = factory.createRouteDisplayer();
	}

	public String[] getResults(UserData data)
	{
		//Logic to get results from weatherDisplayer and routeDisplayer methods
		strWeatherValue = weatherDisplayer.getWeather(data);
		strRouteDetails = routeDisplayer.getRoute(data);
		//For now return new ArrayList
		strBothDetails[0] =strWeatherValue;
		strBothDetails[1] = strRouteDetails;
		return strBothDetails;
	}
}
