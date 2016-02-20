package creational.builder;

/**
 * Abstract builder.
 * @author che
 *
 */
public interface HamburgerMaker {

	public void buildBread();
	public void buildMeat();
	public void buildVagetable();
	public void buildJam();
	public Hamburger retrieveResult();
}
