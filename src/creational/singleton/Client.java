package creational.singleton;

public class Client {

	public void testSingleton() {
		Singleton singleton0 = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton0 == singleton1);
	}
	
	public void testUser() {
		User user0 = User.getInstance(0);
		User user1 = User.getInstance(1);
		User user = User.getInstance(0);
		System.out.println(user0 == user1);
		System.out.println(user0 == user);
	}
	
	public static void main(String[] args) {
		new Client().testSingleton();
		new Client().testUser();
	}
}
