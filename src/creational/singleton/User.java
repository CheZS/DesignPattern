package creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * User有多个实例，但每个实例保证单例模式。
 * @author che
 *
 */
public class User {

	private static Map<Integer, User> instances = new HashMap<Integer, User>();
	private int uid;
	
	private User(int uid) {
		this.uid = uid;
	}
	
	public static User getInstance() {
		return getInstance(0);
	}
	
	public synchronized static User getInstance(int uid) {
		if (instances.isEmpty() || !instances.containsKey(uid)) {
			instances.put(uid, new User(uid));
		}
		return instances.get(uid);
	}

	public int getUid() {
		return uid;
	}

}
