/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Parser;

import java.io.InputStream;
import org.json.*;
//import Route.RouteDetails;
import java.util.*;

/**
*
* @author Tamizhselvan
*/

public class JSONParserCelciusStrategy {

    public String parseJson(String the_json) {

        
        ArrayList<JSONObject> arrayforCityCode = new ArrayList<JSONObject>();
        double celciusTemperature = 0;
        Long cTemp = 0L;

        try {
        	
            JSONObject gCityCode = new JSONObject(the_json);
            JSONArray routes = gCityCode.getJSONArray("forecastHourlyList");	
            
                        
            int size = routes.length();
            int iLoop = 0;
            System.out.println("Celcius Object Instantiation -- Strategy");
            	JSONObject temp = routes.getJSONObject(1);
            	
            	String temperature = temp.getString("temperature");
            	
            	//System.out.println("Predicted temperature for the next "+iLoop+" hour(s) is "+temperature);
            	int farenheitTemperature = Integer.parseInt(temperature);
            	
            	celciusTemperature = (farenheitTemperature - 32)*(0.56);
            	cTemp = Math.round(celciusTemperature);
            	System.out.println("Predicted temperature for the next "+iLoop+" hour(s) is "+celciusTemperature+" Celcius");
            	
            	
            
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (String.valueOf(cTemp));
    }

    

}