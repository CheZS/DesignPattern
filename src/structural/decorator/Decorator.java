package structural.decorator;

/**
 * Decorator.
 * ��̬�ظ�һ���������һЩ�����ְ�����Ϊ.
 * ���Կ���һ���˻���Compositeģʽ.
 * ��ˣ�decorator�Ľӿ�Ҫ��ԭ����һ��.
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
