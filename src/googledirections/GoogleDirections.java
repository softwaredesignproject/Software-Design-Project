/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package googledirections;

import API.DirectionsAPI;
import Parser.JSONParser;
import Route.RouteDetails;
import org.json.*;
import java.util.*;
/**
 *
 * @author Tamizhselvan
 */
public class GoogleDirections {
     
    private DirectionsAPI dirAPI;   
    
    private JSONParser jsonParser;
    
    private RouteDetails route;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DirectionsAPI test = new DirectionsAPI();
        String testoutput = test.getDirections("1425 N Park Avenue,Tucson,Arizona", "Student Union Memorial Center, Tucson, AZ", "walking");
        JSONParser jsonParse = new JSONParser();
        ArrayList<JSONObject> testOutput = jsonParse.parseJson(testoutput);
        for(int i=0;i< testOutput.size();i++)
            System.out.println(testOutput.get(i).toString());
        

    }
}
