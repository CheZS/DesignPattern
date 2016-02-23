package structural.bridge;

/**
 * ������Factoryģʽ������������Bridgeģʽ
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
