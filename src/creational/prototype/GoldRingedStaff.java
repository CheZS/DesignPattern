package creational.prototype;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable {

	private static final long serialVersionUID = 1L;
	private double height = 100.0;
	private double diameter = 10.0;
	
	public void grow() {
		this.height *= 2;
		this.diameter *= 2;
	}
	
	public void shrink() {
		this.height /= 2;
		this.diameter /= 2;
	}

	public double getHeight() {
		return height;
	}

	public double getDiameter() {
		return diameter;
	}
	
}
