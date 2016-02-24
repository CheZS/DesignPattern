package creational.factory;

/**
 * Concrete factory 2.
 * @author che
 *
 */
public class BenzFactory extends Factory {

	@Override
	public Car createCar() {
		return new Benz();
	}

	@Override
	public AirCondition createAirCondition() {
		return new BenzAirCondition();
	}

}
