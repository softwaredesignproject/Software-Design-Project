package strategy;

import API.DirectionsAPI;
import user.UserData;


public class BusRouteDisplayer extends RouteDisplayer{
	@Override
	public String getRoute(UserData data) {
		// TODO Auto-generated method stub
		// Logic for BusRouteDisplayer
		DirectionsAPI getRouteDirections = new DirectionsAPI();
		return getRouteDirections.getDirections(data.getStartaddress(), data.getEndaddress(), data.getRbtransport());
		
	}
	

}
