package factory;

import strategy.CelciusWeatherDisplayer;
import strategy.RouteDisplayer;
import strategy.WalkRouteDisplayer;
import strategy.WeatherDisplayer;

/**
 * @author Arthi
 *
 */
public class WalkCelciusFactory extends TripFactory {

	@Override
	public RouteDisplayer createRouteDisplayer() {
		// TODO Auto-generated method stub
		System.out.println("WalkCelciusFactory RouteDisplayer");
		return new WalkRouteDisplayer();
	}

	@Override
	public WeatherDisplayer createWeatherDisplayer() {
		// TODO Auto-generated method stub
		System.out.println("WalkCelciusFactory WeatherDisplayer");
		return new CelciusWeatherDisplayer();
	}

}
