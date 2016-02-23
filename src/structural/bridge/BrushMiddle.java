package structural.bridge;

/**
 * Refined Abstraction.
 * @author che
 *
 */
public class BrushMiddle extends Brush {

	@Override
	public void draw() {
		System.out.println("MiddleBrush");
		this.color.bePaint();
	}

}
