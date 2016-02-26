package structural.proxy;

/**
 * Static proxy.
 * ����ģʽ���������
 * 1) Զ�̴���Remote  Proxy��Ϊһ��λ�ڲ�ͬ�ĵ�ַ�ռ�Ķ����ṩһ�����صĴ�����������ͬ�ĵ�ַ�ռ��������ͬһ̨�����У�Ҳ��������һ̨�����У�Զ�̴����ֽ�����ʹ(Ambassador)
 * 2) �������Virtual Proxy��������Ҫ���������ܴ�Ķ��������Ҫ����һ����Դ���Ľϴ�Ķ����ȴ���һ��������Խ�С�Ķ�������ʾ����ʵ����ֻ����Ҫʱ�Żᱻ���������� 
 * 3) ��������Protection Proxy�����ƶ�ԭʼ����ķ��ʡ������������ڶ���Ӧ���в�ͬ�ķ���Ȩ�޵�ʱ��
 * 4) ����ָ����Smart Reference��ȡ���˼򵥵�ָ�룬���ڷ��ʶ���ʱִ��һЩ���Ӳ�����
 * 5) Copy-on-Write����������������һ�֣��Ѹ��ƣ���¡�������ӳٵ�ֻ���ڿͻ���������Ҫʱ��ִ�С�һ����˵����������¡��һ�������ϴ�Ĳ�����Copy-on-Write�����������������ӳ٣�ֻ�ж����õ���ʱ��ű���¡��
 * @author che
 *
 */
public class Assistant implements Leader {

	private Leader leader;
	
	/**
	 * �ӳٴ���
	 * ����sign����ʱleader�ű�����
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
