package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlyweightFactory {

	private Map<String, FlyweightConcrete> flyweights;
	
	public FlyweightFactory() {
		this.flyweights = new HashMap<String, FlyweightConcrete>();
	}
	
	/**
	 * 返回简单享元
	 * @param key
	 * @return
	 */
	public synchronized Flyweight getFlyweight(String key) {
		if (this.flyweights.containsKey(key)) {
			return this.flyweights.get(key);
		} else {
			FlyweightConcrete flyweight = new FlyweightConcrete(key);
			flyweights.put(key, flyweight);
			return flyweight;
		}
	}
	
	/**
	 * 返回复合享元
	 * @param states
	 * @return
	 */
	public Flyweight getFlyweight(Set<String> states) {
		FlyweightComposite fc = new FlyweightComposite();
		for (String s : states) {
			fc.add(s, this.getFlyweight(s));
		}
		return fc;
	}
	
	public synchronized int getFactorySize() {
		return this.flyweights.size();
	}
	
	
}
