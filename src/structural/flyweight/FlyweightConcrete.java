package structural.flyweight;

/**
 * 简单享元
 * @author che
 *
 */
public class FlyweightConcrete implements Flyweight {

	/* 内部状态 高度复用 共享 很少修改 */
	private String state;
	
	@Override
	public synchronized void operation(String state) {
		System.out.println("Concrete flyweight operation, local state= " 
					+ this.state + ", input state= " + state);
	}

	/**
	 * 必要情况下，把外部状态传递给flyweight
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
