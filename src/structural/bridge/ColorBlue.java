package structural.bridge;

/**
 * Concrete Implementor.
 * @author che
 *
 */
public class ColorBlue extends Color {

	public ColorBlue() {
		this.value = "Blue";
	}
	
	@Override
	public void bePaint() {
		System.out.println(this.value);
	}

}
