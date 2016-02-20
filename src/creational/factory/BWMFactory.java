package creational.factory;

/**
 * Concrete factory 1.
 * @author che
 *
 */
public class BWMFactory extends Factory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BWM();
	}

	@Override
	public AirCondition createAirCondition() {
		// TODO Auto-generated method stub
		return new BWMAirCondition();
	}

}
