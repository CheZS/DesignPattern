package structural.composite;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Composite.
 * @author che
 *
 */
public class MenuComposite extends MenuComponent {

	public MenuComposite(String name) {
		this.name = name;
		this.childs = new HashSet<MenuComponent>();
	}
	
	@Override
	public synchronized boolean add(MenuComponent component) {
		return this.childs.add(component);
	}

	@Override
	public synchronized boolean remove(MenuComponent component) {
		return this.childs.remove(component);
	}

	@Override
	public synchronized MenuComponent getChild(int index) {
		if (index < 0) return null;
		Iterator<MenuComponent> iter = this.childs.iterator();
		int i = 0;
		while (iter.hasNext() && i < index) {
			iter.next();
			i++;
		}
		return iter.hasNext() ? iter.next() : null;
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
		String align = "|";
		if (!this.childs.isEmpty()) align += "__";
		System.out.println(this.name);
		for (MenuComponent c : this.childs) {
			blank++;
			for (int i = 0; i < blank; i++) System.out.print(" ");
			System.out.print(align);
			c.displayOperation();
			blank--;
		}
	}

	private static int blank = 0;
}
