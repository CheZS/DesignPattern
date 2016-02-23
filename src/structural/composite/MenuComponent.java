package structural.composite;

import java.util.Set;

/**
 * Component.
 * 对不同的Leaf和Composite提供一致的接口.
 * 常与 装饰，Flyweight，迭代器，观察者模式 一起使用.
 * @author che
 *
 */
public abstract class MenuComponent {

	public abstract boolean add(MenuComponent component);
	public abstract boolean remove(MenuComponent component);
	public abstract MenuComponent getChild(int index);
	public abstract String getName();
	public abstract String getUrl();
	public abstract void displayOperation();
	
	protected String name;
	protected String url;
	protected Set<MenuComponent> childs;
}
