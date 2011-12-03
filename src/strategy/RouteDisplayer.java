package strategy;

import user.UserData;
import API.DirectionsAPI;


public abstract class RouteDisplayer {
	//DirectionsAPI getRouteDirections = new DirectionsAPI();
	
	public abstract String getRoute(UserData data);
}
