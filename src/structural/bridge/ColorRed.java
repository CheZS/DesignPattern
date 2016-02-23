package structural.bridge;

/**
 * Concrete Implementor.
 * @author che
 *
 */
public class ColorRed extends Color {

	public ColorRed() {
		this.value = "Red";
	}
	
	@Override
	public void bePaint() {
		System.out.println(this.value);
	}

}
