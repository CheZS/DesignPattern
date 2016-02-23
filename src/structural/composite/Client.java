package structural.composite;

public class Client {

	public static void main(String[] args) {
		new Client().displayMenu();
	}
	
	public void displayMenu() {
		MenuComponent root = new MenuComposite("root");
		MenuComponent subMenu1 = new MenuComposite("subMenu1");
		MenuComponent subMenu2 = new MenuComposite("subMenu2");
		MenuComponent subMenu3 = new MenuComposite("subMenu3");
		MenuComponent subMenu4 = new MenuComposite("subMenu4");
		MenuComponent item1 = new ItemLeaf("google", "www.google.com");
		MenuComponent item2 = new ItemLeaf("baidu", "www.baidu.com");
		
		root.add(subMenu1);
		root.add(subMenu2);
		subMenu1.add(subMenu3);
		subMenu1.add(subMenu4);
		subMenu2.add(item1);
		subMenu3.add(item2);
		
		root.displayOperation();
	}
}
