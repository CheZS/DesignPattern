package creational.prototype;

import java.io.IOException;

/**
 * Client.
 * ͨ������monkey��clone��deepClone��ʵ�ֱ�ݵĿ�¡�����Ρ�
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
