package controller;
import java.util.*;

import org.json.JSONObject;

import Parser.JSONParser;
import user.UserData;
import factory.*;

public class LogicController {
	UserData userData = new UserData();
	private ArrayList alFinalResult = new ArrayList();
	private String strRouteDetails;
		
	/**
	 * @return - results from RouteWeatherProcessor
	 */
	public ArrayList getAlFinalResult() {
		return alFinalResult;
	}
	
	//Instantiate Trip Factory with if else logic based on private variables
	TripFactory tripFactory = null ;
	{
	if (userData.getRbtransport()=="bus" && (userData.getRbtemp()=="C"))
	{
		tripFactory = new BusCelciusFactory();
	}
	else if (userData.getRbtransport()=="bus" && userData.getRbtemp()=="F")
	{
		tripFactory = new BusFarenheitFactory();
	}
	else if (userData.getRbtransport()=="walk" && userData.getRbtemp()=="C")
	{
		tripFactory = new WalkCelciusFactory();
	}
	else if (userData.getRbtransport()=="walk" && userData.getRbtemp()=="F")
	{
		tripFactory = new WalkFarenheitFactory();
	}
	
	RouteWeatherProcessor routeWeatherProcessor = null;
	routeWeatherProcessor = new RouteWeatherProcessor(tripFactory);
	
	//Get the distance result, weather result from correct factory and store in private variable
	//alFinalResult = 
	strRouteDetails = routeWeatherProcessor.getResults(userData);
	JSONParser jsonParse = new JSONParser();
    ArrayList<JSONObject> testOutput = jsonParse.parseJson(strRouteDetails);
    for(int i=0;i< testOutput.size();i++)
        System.out.println(testOutput.get(i).toString());

}
}