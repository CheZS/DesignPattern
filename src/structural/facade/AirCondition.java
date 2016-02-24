package structural.facade;

public class AirCondition extends Subsystem {

	private boolean isOpen = false;
	
	@Override
	public boolean add(Subsystem subsystem) {
		return false;
	}

	@Override
	public boolean remove(Subsystem subsystem) {
		return false;
	}

	@Override
	public Subsystem getChild(int index) {
		return null;
	}

	@Override
	public String getName() {
		return "air condition";
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}

	@Override
	public void on() {
		this.isOpen = true;
		System.out.println("Air condition is open.");
	}

	@Override
	public void off() {
		this.isOpen = false;
		System.out.println("Air condition is off.");
	}

}
