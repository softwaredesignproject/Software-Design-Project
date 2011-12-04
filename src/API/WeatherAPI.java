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

public class WeatherAPI {

    public String getCityName(String cityzip) {
        String directionResponse = "";
        try {
            Client client = Client.create();
            
            WebResource webResource = client.resource("http://i.wxbug.net/REST/Direct/GetForecastHourly.ashx");
          
            MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
           
                    
            	queryParams.add("api_key", "fbypgjdz5zy5w3uxrd97wvv4");
            	queryParams.add("nf", "1");
            	queryParams.add("ih", "1");
            	queryParams.add("ht", "i");
            	queryParams.add("ht", "d");
            	queryParams.add("ht", "t");
            	queryParams.add("zip", cityzip);
          
            directionResponse = webResource.queryParams(queryParams).get(String.class);
                             

        } catch (Exception e) {
            e.printStackTrace();
        }

        return directionResponse;
    }
}