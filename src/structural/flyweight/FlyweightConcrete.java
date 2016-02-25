package structural.flyweight;

/**
 * ����Ԫ
 * @author che
 *
 */
public class FlyweightConcrete implements Flyweight {

	/* �ڲ�״̬ �߶ȸ��� ���� �����޸� */
	private String state;
	
	@Override
	public synchronized void operation(String state) {
		System.out.println("Concrete flyweight operation, local state= " 
					+ this.state + ", input state= " + state);
	}

	/**
	 * ��Ҫ����£����ⲿ״̬���ݸ�flyweight
	 * @param state
	 */
	public FlyweightConcrete(String state) {
		this.state = state;
	}
	
	public synchronized void setState(String state) {
		this.state = state;
	}
	
	public synchronized String getState() {
		return this.state;
	}
}
