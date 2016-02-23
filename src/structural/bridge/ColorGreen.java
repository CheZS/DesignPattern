package structural.bridge;

/**
 * Concrete Implementor.
 * @author che
 *
 */
public class ColorGreen extends Color {

	public ColorGreen() {
		this.value = "Green";
	}
	
	@Override
	public void bePaint() {
		System.out.println(this.value);
	}

}
