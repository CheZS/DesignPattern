package creational.factory;

/**
 * Concrete air condition 2.
 * @author che
 *
 */
public class BenzAirCondition implements AirCondition {

	@Override
	public String getName() {
		return new String("Benz air condition");
	}

}
