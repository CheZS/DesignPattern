package creational.builder;

/**
 * Director.
 * 建造者模式针对复杂的制造过程，由Director处理。
 * 建造过程全部完成后，由Director返回结果。
 * 建造者模式可以和抽象工厂模式混合使用。
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
