package factory;

import strategy.BusRouteDisplayer;
import strategy.FarenheitWeatherDisplayer;
import strategy.RouteDisplayer;
import strategy.WeatherDisplayer;

/**
 * @author Arthi
 *
 */
public class BusFarenheitFactory extends TripFactory {

	@Override
	public RouteDisplayer createRouteDisplayer() {
		// TODO Auto-generated method stub
		return new BusRouteDisplayer();
	}

	@Override
	public WeatherDisplayer createWeatherDisplayer() {
		// TODO Auto-generated method stub
		return new FarenheitWeatherDisplayer();
	}

}
