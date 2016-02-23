package structural.bridge;

/**
 * Abstraction.
 * Abstract attribute.
 * @author che
 *
 */
public abstract class Brush {

	protected Color color = null;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
