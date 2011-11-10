/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import com.sun.jersey.api.client.Client;
import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Tamizhselvan
 */
public class DirectionsAPI {

    public String getDirections(String startLocation, String endLocation, String modeOfTravel) {
        String directionResponse = "";

        try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://maps.googleapis.com/maps/api/directions/json");
            MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();

            if (startLocation.length() > 0 && endLocation.length() > 0 && modeOfTravel.length() > 0) {
                queryParams.add("origin", startLocation);
                queryParams.add("destination", endLocation);
                queryParams.add("mode", modeOfTravel);
                queryParams.add("sensor","false");
                queryParams.add("alternatives","true");
            }
            directionResponse = webResource.queryParams(queryParams).get(String.class);
           // System.out.println(directionResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return directionResponse;
    }
}
