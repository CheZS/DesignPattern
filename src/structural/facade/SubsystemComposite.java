package structural.facade;

import java.util.HashSet;
import java.util.Iterator;

public class SubsystemComposite extends Subsystem {

	public SubsystemComposite() {
		this.childs = new HashSet<Subsystem>();
	}
	
	@Override
	public synchronized boolean add(Subsystem subsystem) {
		return this.childs.add(subsystem);
	}

	@Override
	public synchronized boolean remove(Subsystem subsystem) {
		return this.childs.remove(subsystem);
	}

	@Override
	public Subsystem getChild(int index) {
		if (index < 0) return null;
		Iterator<Subsystem> iter = this.childs.iterator();
		int i = 0;
		while (iter.hasNext() && i < index) {
			i++;
			iter.next();
		}
		return iter.hasNext() ? iter.next() : null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void on() {
		for (Subsystem subsystem : childs) {
			subsystem.on();
		}
	}

	@Override
	public void off() {
		for (Subsystem subsystem : childs) {
			subsystem.off();
		}
	}

}
