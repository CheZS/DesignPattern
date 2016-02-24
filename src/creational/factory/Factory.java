package creational.factory;

/**
 * Abstract factory.
 * 封装了复杂的对象创建过程，且能实现多产品组合创建.
 * @author che
 *
 */
public abstract class Factory {
	public abstract Car createCar();
	public abstract AirCondition createAirCondition();
}
