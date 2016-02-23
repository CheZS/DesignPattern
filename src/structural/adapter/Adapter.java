package structural.adapter;

public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter() {
		adaptee = new Adaptee();
	}
	
	/* adapter API */
	@Override
	public void hello() {
		adaptee.great();
	}

	@Override
	public void world() {
		adaptee.world();
	}

}
