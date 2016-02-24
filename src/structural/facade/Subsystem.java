package structural.facade;

import java.util.Set;

/**
 * Component.
 * Compositeģʽ.
 * @author che
 *
 */
public abstract class Subsystem {

	public abstract boolean add(Subsystem subsystem);
	public abstract boolean remove(Subsystem subsystem);
	public abstract Subsystem getChild(int index);
	public abstract String getName();
	public abstract void on();
	public abstract void off();
	
	protected String name;
	protected Set<Subsystem> childs;
}
