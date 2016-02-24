package structural.facade;

/**
 * Facade.
 * 实现Client和各子系统之间解耦.
 * 可以用抽象Facade，以及composite模式，减少修改子系统导致的复杂性.
 * 缺点：如对Client访问子系统做太多限制，会减少自由度.
 * @author che
 *
 */
public class Switch {

	private Subsystem subsystem = null;
	
	public Switch() {
		this.subsystem = new SubsystemComposite();
	}
	
	public void on() {
		subsystem.on();
	}
	
	public void off() {
		subsystem.off();
	}
	
	public boolean addSubsystem(Subsystem subsystem) {
		return this.subsystem.add(subsystem);
	}
	
	public boolean removeSubsystem(Subsystem subsystem) {
		return this.subsystem.remove(subsystem);
	}
}
