package structural.bridge;

/**
 * 可以用Factory模式来创建和配置Bridge模式
 * @author che
 *
 */
public class Client {

	public static void main(String[] args) {
		new Client().draw();
	}
	
	public void draw() {
		Brush small = new BrushSmall();
		small.setColor(new ColorRed());
		small.draw();
	}

}
