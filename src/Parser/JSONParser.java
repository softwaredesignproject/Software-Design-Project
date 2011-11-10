/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.io.InputStream;
import org.json.*;
import Route.RouteDetails;
import java.util.*;

/**
 *
 * @author Tamizhselvan
 */
public class JSONParser {

    public ArrayList parseJson(String the_json) {

        ArrayList<JSONObject> arraysforRoute = new ArrayList<JSONObject>();
        ArrayList<JSONObject> arraysForLegs = new ArrayList<JSONObject>();

        try {

            JSONObject gDirections = new JSONObject(the_json);
            JSONArray routes = gDirections.getJSONArray("routes");
            int size = routes.length();
            int iLoop = 0;



            for (int i = 0; i < size; i++) {
                JSONObject routeParams = routes.getJSONObject(i);
                arraysforRoute.add(routeParams);
            }
            for (int i = 0; i < arraysforRoute.size(); i++) {

                JSONArray legs = arraysforRoute.get(i).getJSONArray("legs");
                int legsize = legs.length();
                for (int j = 0; j < legsize; j++) {
                    JSONObject LegParams = legs.getJSONObject(j);
                    arraysForLegs.add(LegParams);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arraysForLegs;
    }

    public String getDurationValue(ArrayList<JSONObject> arraysForLegs) {
        String durationValue = "";
        try {
            for (int i = 0; i < arraysForLegs.size(); i++) {
                JSONObject duration = arraysForLegs.get(i).getJSONObject("duration");
                durationValue = duration.get("text").toString();

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return durationValue;
    }

    public String getDistanceValue(ArrayList<JSONObject> arraysForLegs) {
        String distanceValue = "";
        try {
            for (int i = 0; i < arraysForLegs.size(); i++) {
                JSONObject duration = arraysForLegs.get(i).getJSONObject("distance");
                distanceValue = duration.get("text").toString();

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return distanceValue;
    }

    public String getEndAddressValue(ArrayList<JSONObject> arraysForLegs) {
        String endAddressValue = "";
        try {
            for (int i = 0; i < arraysForLegs.size(); i++) {
                JSONObject duration = arraysForLegs.get(i).getJSONObject("end_address");
                endAddressValue = duration.get("text").toString();

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return endAddressValue;
    }
}
