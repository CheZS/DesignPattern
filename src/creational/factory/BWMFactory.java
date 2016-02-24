package creational.factory;

/**
 * Concrete factory 1.
 * @author che
 *
 */
public class BWMFactory extends Factory {

	@Override
	public Car createCar() {
		return new BWM();
	}

	@Override
	public AirCondition createAirCondition() {
		return new BWMAirCondition();
	}

}
