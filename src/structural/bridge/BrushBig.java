package structural.bridge;

/**
 * Refined Abstraction.
 * @author che
 *
 */
public class BrushBig extends Brush {

	@Override
	public void draw() {
		System.out.println("BigBrush");
		this.color.bePaint();
	}

}
