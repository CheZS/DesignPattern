package creational.builder;

/**
 * Director.
 * ������ģʽ��Ը��ӵ�������̣���Director����
 * �������ȫ����ɺ���Director���ؽ����
 * ������ģʽ���Ժͳ��󹤳�ģʽ���ʹ�á�
 * @author che
 *
 */
public class Cashier {

	public Hamburger buildHamburger(HamburgerMaker maker) {
		maker.buildBread();
		maker.buildMeat();
		maker.buildVagetable();
		maker.buildJam();
		return maker.retrieveResult();
	}
}
