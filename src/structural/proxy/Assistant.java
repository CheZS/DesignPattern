package structural.proxy;

/**
 * Static proxy.
 * 代理模式常见情况：
 * 1) 远程代理（Remote  Proxy）为一个位于不同的地址空间的对象提供一个本地的代理对象。这个不同的地址空间可以是在同一台主机中，也可是在另一台主机中，远程代理又叫做大使(Ambassador)
 * 2) 虚拟代理（Virtual Proxy）根据需要创建开销很大的对象。如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，真实对象只在需要时才会被真正创建。 
 * 3) 保护代理（Protection Proxy）控制对原始对象的访问。保护代理用于对象应该有不同的访问权限的时候。
 * 4) 智能指引（Smart Reference）取代了简单的指针，它在访问对象时执行一些附加操作。
 * 5) Copy-on-Write代理：它是虚拟代理的一种，把复制（克隆）操作延迟到只有在客户端真正需要时才执行。一般来说，对象的深克隆是一个开销较大的操作，Copy-on-Write代理可以让这个操作延迟，只有对象被用到的时候才被克隆。
 * @author che
 *
 */
public class Assistant implements Leader {

	private Leader leader;
	
	/**
	 * 延迟代理
	 * 调用sign方法时leader才被创建
	 * @return
	 */
	private Leader getLeader() {
		System.out.println("Delay construct leader.");
		if (this.leader == null || this.leader.getClass() != CEO.class) {
			this.leader = new CEO();
		}
		return this.leader;
	}
	
	@Override
	public void sign() {
		System.out.println("Assistant help.");
		this.getLeader().sign();
	}

}
