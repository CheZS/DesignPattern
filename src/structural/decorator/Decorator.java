package structural.decorator;

/**
 * Decorator.
 * 动态地给一个对象添加一些额外的职责或行为.
 * 可以看做一个退化的Composite模式.
 * 因此，decorator的接口要与原对象一致.
 * @author che
 *
 */
public class Decorator {

	protected Widget widget;
	
	public Decorator(Widget widget) {
		this.widget = widget;
	}
	
	public String paint() {
		return this.widget.paint();
	}
}
