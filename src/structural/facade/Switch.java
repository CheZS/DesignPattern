package structural.facade;

/**
 * Facade.
 * ʵ��Client�͸���ϵͳ֮�����.
 * �����ó���Facade���Լ�compositeģʽ�������޸���ϵͳ���µĸ�����.
 * ȱ�㣺���Client������ϵͳ��̫�����ƣ���������ɶ�.
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
