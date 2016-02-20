package creational.prototype;

import java.io.IOException;

/**
 * Client.
 * 通过调用monkey的clone和deepClone，实现便捷的克隆与修饰。
 * @author che
 *
 */
public class SunWukong {

	private Monkey monkey = new Monkey();
	
	public void copy() {
		Monkey copyMonkey = (Monkey) monkey.clone();
		System.out.println("Sun Wukong birthday: " + monkey.getBirthday());
		System.out.println("Copy monkey birthday: " + copyMonkey.getBirthday());
		System.out.println(monkey == copyMonkey);
		System.out.println(monkey.getStaff() == copyMonkey.getStaff());
	}
	
	public void deepCopy() throws ClassNotFoundException, IOException {
		Monkey copyMonkey = (Monkey) monkey.deepClone();
		System.out.println("Sun Wukong birthday: " + monkey.getBirthday());
		System.out.println("Copy monkey birthday: " + copyMonkey.getBirthday());
		System.out.println(monkey == copyMonkey);
		System.out.println(monkey.getStaff() == copyMonkey.getStaff());
	}
	
	public static void main(String[] args) throws ClassNotFoundException, 
			IOException {
		SunWukong sun = new SunWukong();
		sun.copy();
		sun.deepCopy();
	}
}
