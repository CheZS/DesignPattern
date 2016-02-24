package structural.facade;

public class Light extends Subsystem {

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
		return "light";
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}

	@Override
	public void on() {
		this.isOpen = true;
		System.out.println("Light is open.");
	}

	@Override
	public void off() {
		this.isOpen = false;
		System.out.println("Light is off.");
	}

}
