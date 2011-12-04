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

public class JSONParserFareneheitStrategy {

    public String parseJson(String the_json) {

        
        ArrayList<JSONObject> arrayforCityCode = new ArrayList<JSONObject>();
        String temperature="";
        try {

            JSONObject gCityCode = new JSONObject(the_json);
            JSONArray routes = gCityCode.getJSONArray("forecastHourlyList");	
            
                        
            int size = routes.length();
            int iLoop = 0;
            System.out.println("Farenheit Object Instantiation -- Strategy");
            	JSONObject temp = routes.getJSONObject(1);
            	
            	temperature = temp.getString("temperature");
            	
            	System.out.println("Predicted temperature for the next "+iLoop+" hour(s) is "+temperature+" Farenheit");
            	
            
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return (temperature);
    }

    

}