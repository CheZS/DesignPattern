package creational.factory;

/**
 * Concrete air condition 1.
 * @author che
 *
 */
public class BWMAirCondition implements AirCondition {

	@Override
	public String getName() {
		return new String("BWM air condition");
	}

}
