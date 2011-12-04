package controller;
import java.util.*;
import java.io.*;
import java.util.*;
import org.json.JSONObject;

import AdjustDuration.DurationAdjustment;
import Parser.JSONParser;
import user.UserData;
import factory.*;
import org.json.*;


public class LogicController {
	//UserData userData = new UserData();
	private ArrayList alFinalResult = new ArrayList();
	private String[] strBothDetails = new String[2];
	private String strRouteDetails;
	private String strWeatherDetails;
		
	/**
	 * @return - results from RouteWeatherProcessor
	 */
	public ArrayList getAlFinalResult(UserData userData) {
		//Instantiate Trip Factory with if else logic based on private variables
		TripFactory tripFactory = null ;
		
			System.out.println("Before decision : "+userData.getRbtransport()+userData.getRbtemp());
		if (userData.getRbtransport().equals("bicycling") && (userData.getRbtemp().equals("C")))
		{
			System.out.println("bicycling C");
			tripFactory = new BusCelciusFactory();
		}
		else if (userData.getRbtransport().equals("bicycling") && userData.getRbtemp().equals("F"))
		{
			System.out.println("bicycling F");
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
		strBothDetails = routeWeatherProcessor.getResults(userData);
		strRouteDetails = strBothDetails[1];
		strWeatherDetails = strBothDetails[0];
		
		JSONParser jsonParse = new JSONParser();
	   
	   	ArrayList<JSONObject> alParsedResult = jsonParse.parseJson(strRouteDetails);
	   	String[] durationValue = new String[alParsedResult.size()] ;
	   		durationValue = jsonParse.getDurationValue(alParsedResult);
	    /*
	   		if (userData.getRbweather()==""){
	    	//DurationAdjustment durAdj = new DurationAdjustment(userData.getRbsex(),userData.getRbgroupsize());
	    	
	    	for (int i = 0;i< durationValue.length;i++) {
	    	
	    	}
	    }
	   	*/	
	   	String[] distanceValue = new String[alParsedResult.size()] ;
	   		distanceValue = jsonParse.getDistanceValue(alParsedResult);
	   	
	   	ArrayList alSteps;
	   		alSteps = jsonParse.getSteps(alParsedResult);
	   		
	   	
	   		
	   		alFinalResult.add(durationValue);
	   		alFinalResult.add(distanceValue);
	   		alFinalResult.add(alSteps);
	   		alFinalResult.add(strWeatherDetails);
	   		
	    return alFinalResult;
	}
	
	
	
}