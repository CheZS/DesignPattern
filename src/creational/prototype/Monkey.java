package creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Prototype.
 * 原型模式的关键，通过序列化和反序列化实现深拷贝。
 * @author che
 *
 */
public class Monkey implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	private int height;
	private int weight;
	private Date birthday;
	private GoldRingedStaff staff;
	
	public Monkey() {
		this.birthday = new Date();
		this.staff = new GoldRingedStaff();
	}
	
	public Object clone() {
		Monkey temp = null;
		try {
			temp = (Monkey) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return temp;
	}
	
	public Object deepClone() throws IOException, 
			ClassNotFoundException {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		bos = new ByteArrayOutputStream();
		oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		bis = new ByteArrayInputStream(bos.toByteArray());
		ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public GoldRingedStaff getStaff() {
		return staff;
	}
	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}
	
}
