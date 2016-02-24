package structural.adapter;

public class Client {

	public static void main(String[] args) {
		new Client().call();
	}
	
	public void call() {
		Target adapter = new Adapter();
		adapter.hello();
		adapter.world();
	}
}
