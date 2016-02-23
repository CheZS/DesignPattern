package structural.adapter;

public class Client {

	public static void main(String[] args) {
		new Client().call();
	}
	
	public void call() {
		Adapter adapter = new Adapter();
		adapter.hello();
		adapter.world();
	}
}
