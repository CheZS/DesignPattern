package creational.builder;

public class FishBurgerMaker implements HamburgerMaker {

	private Hamburger hamburger = new Hamburger();
	
	@Override
	public void buildBread() {
		// TODO Auto-generated method stub
		hamburger.setBread(new String("Bread"));
	}

	@Override
	public void buildMeat() {
		// TODO Auto-generated method stub
		hamburger.setMeat(new String("Fish"));
	}

	@Override
	public void buildVagetable() {
		// TODO Auto-generated method stub
		hamburger.setVagetable(null);
	}

	@Override
	public void buildJam() {
		// TODO Auto-generated method stub
		hamburger.setJam(new String("Salad dressing"));
	}

	@Override
	public Hamburger retrieveResult() {
		// TODO Auto-generated method stub
		return hamburger;
	}

}
