package factory;

import strategy.RouteDisplayer;
import strategy.WeatherDisplayer;

/**
 * @author Arthi
 *
 */
public abstract class TripFactory {

	public abstract RouteDisplayer createRouteDisplayer();
	public abstract WeatherDisplayer createWeatherDisplayer();

	
}
