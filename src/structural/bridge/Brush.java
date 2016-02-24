package structural.bridge;

/**
 * Abstraction.
 * Abstract attribute.
 * 它持有另一个属性的引用，实现了两种属性的动态组合.
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
