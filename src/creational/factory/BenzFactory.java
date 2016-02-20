package creational.factory;

/**
 * Concrete factory 2.
 * @author che
 *
 */
public class BenzFactory extends Factory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

	@Override
	public AirCondition createAirCondition() {
		// TODO Auto-generated method stub
		return new BenzAirCondition();
	}

}
