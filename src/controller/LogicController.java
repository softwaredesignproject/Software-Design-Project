package controller;
import java.util.*;
import java.io.*;
import java.util.*;
import org.json.JSONObject;

import Parser.JSONParser;
import user.UserData;
import factory.*;
import org.json.*;


public class LogicController {
	//UserData userData = new UserData();
	//private ArrayList alFinalResult = new ArrayList();
	private String strRouteDetails;
		
	/**
	 * @return - results from RouteWeatherProcessor
	 */
	public ArrayList getAlFinalResult(UserData userData) {
		//Instantiate Trip Factory with if else logic based on private variables
		TripFactory tripFactory = null ;
		
			System.out.println("Before decision : "+userData.getRbtransport()+userData.getRbtemp());
		if (userData.getRbtransport().equals("bus") && (userData.getRbtemp().equals("C")))
		{
			System.out.println("Bus C");
			tripFactory = new BusCelciusFactory();
		}
		else if (userData.getRbtransport().equals("bus") && userData.getRbtemp().equals("F"))
		{
			System.out.println("Bus F");
			tripFactory = new BusFarenheitFactory();
		}
		else if (userData.getRbtransport().equals("walk") && userData.getRbtemp().equals("C"))
		{
			System.out.println("Walk C");
			tripFactory = new WalkCelciusFactory();
		}
		else if (userData.getRbtransport().equals("walk") && userData.getRbtemp().equals("F"))
		{
			System.out.println("Walk F");
			tripFactory = new WalkFarenheitFactory();
		}
		
		RouteWeatherProcessor routeWeatherProcessor = null;
		routeWeatherProcessor = new RouteWeatherProcessor(tripFactory);
		
		//Get the distance result, weather result from correct factory and store in private variable
		//alFinalResult = 
		strRouteDetails = routeWeatherProcessor.getResults(userData);
		JSONParser jsonParse = new JSONParser();
	   
	   	ArrayList<JSONObject> alParsedResult = jsonParse.parseJson(strRouteDetails);
	   	String[] durationValue = new String[alParsedResult.size()] ;
	   		durationValue = jsonParse.getDurationValue(alParsedResult);
	    
	   	String[] distanceValue = new String[alParsedResult.size()] ;
	   		distanceValue = jsonParse.getDistanceValue(alParsedResult);
	   		
	    
		return alParsedResult;
	}
	
	
	
}