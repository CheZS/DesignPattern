package structural.facade;

public class Client {

	public static void main(String[] args) {
		new Client().call();
	}
	
	public void call() {
		Switch s = new Switch();
		s.addSubsystem(new Light());
		s.addSubsystem(new AirCondition());
		s.on();
		s.off();
	}
}
