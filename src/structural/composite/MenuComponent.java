package structural.composite;

import java.util.Set;

/**
 * Component.
 * �Բ�ͬ��Leaf��Composite�ṩһ�µĽӿ�.
 * ���� װ�Σ�Flyweight�����������۲���ģʽ һ��ʹ��.
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
