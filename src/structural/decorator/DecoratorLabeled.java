package structural.decorator;

/**
 * Concrete decorator.
 * @author che
 *
 */
public class DecoratorLabeled extends Decorator {

	protected String label;
	
	public DecoratorLabeled(String label, Widget widget) {
		super(widget);
		this.label = label;
	}
	
	public String paint() {
		return "<b>" + this.label + "</b> " + this.widget.paint();
	}
}
