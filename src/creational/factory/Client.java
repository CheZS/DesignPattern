package creational.factory;

public class Client {

	private Car car;
	private AirCondition airCondition;
	
	public static void main(String[] args) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException {
		Client c = new Client();
		c.buyCar("creational.factory.BWMFactory");
		System.out.println(c.getCar().getName());
		System.out.println(c.getAirCondition().getName());
		
		c.buyCar("creational.factory.BenzFactory");
		System.out.println(c.getCar().getName());
		System.out.println(c.getAirCondition().getName());
	}
	
	public void buyCar(String factoryClass) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException {
		Factory factory = (Factory) Class.forName(factoryClass).newInstance();
		this.car = factory.createCar();
		this.airCondition = factory.createAirCondition();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public AirCondition getAirCondition() {
		return airCondition;
	}

	public void setAirCondition(AirCondition airCondition) {
		this.airCondition = airCondition;
	}
	
	
}
