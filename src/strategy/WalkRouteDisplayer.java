package strategy;

import user.UserData;
import API.DirectionsAPI;
public class WalkRouteDisplayer extends RouteDisplayer {

	@Override
	public String getRoute(UserData data) {
		// TODO Auto-generated method stub
		// insert here logic for WalkRouteDisplay
		DirectionsAPI getRouteDirections = new DirectionsAPI();
		return getRouteDirections.getDirections(data.getStartaddress(), data.getEndaddress(), data.getRbtransport());
	}

}
