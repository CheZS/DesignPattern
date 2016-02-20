package creational.builder;

public class Client {

	public void buyHamburger(String clazz) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException {
		Cashier cashier = new Cashier();
		HamburgerMaker maker = (HamburgerMaker) Class.forName(clazz).newInstance();
		Hamburger hamburger = cashier.buildHamburger(maker);
		System.out.println(hamburger.getBread());
		System.out.println(hamburger.getMeat());
		System.out.println(hamburger.getVagetable());
		System.out.println(hamburger.getJam());
	}
	
	public static void main(String[] args) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException {
		new Client().buyHamburger("creational.builder.ChickenBurgerMaker");
		new Client().buyHamburger("creational.builder.FishBurgerMaker");
	}
}
