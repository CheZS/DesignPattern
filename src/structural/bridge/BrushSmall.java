package structural.bridge;

/**
 * Refined Abstraction.
 * @author che
 *
 */
public class BrushSmall extends Brush {

	@Override
	public void draw() {
		System.out.println("SmallBrush");
		this.color.bePaint();
	}

}
