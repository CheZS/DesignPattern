package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ¸´ºÏÏíÔª
 * @author che
 *
 */
public class FlyweightComposite implements Flyweight {

	private Map<String, Flyweight> childs = new HashMap<String, Flyweight>();
	
	@Override
	public void operation(String state) {
		for (Object o : childs.keySet()) {
			childs.get(o).operation(state);
		}
	}

	public synchronized Flyweight add(String key, Flyweight flyweight) {
		return childs.put(key, flyweight);
	}
	
	public synchronized Flyweight remove(String key) {
		return childs.remove(key);
	}
	
}
