package structural.composite;

/**
 * Leaf.
 * @author che
 *
 */
public class ItemLeaf extends MenuComponent {

	public ItemLeaf(String name, String url) {
		this.name = name;
		this.url = url;
	}
	@Override
	public boolean add(MenuComponent component) {
		return false;
	}

	@Override
	public boolean remove(MenuComponent component) {
		return false;
	}

	@Override
	public MenuComponent getChild(int index) {
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getUrl() {
		return this.url;
	}

	@Override
	public void displayOperation() {
		System.out.println(this.name + ", " + this.url );
	}

}
