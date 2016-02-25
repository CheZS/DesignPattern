package structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		new Client().call();
	}
	
	public void call() {
		FlyweightFactory factory = new FlyweightFactory();
		
		/* ºÚµ•œÌ‘™≤‚ ‘ */
		String s1 = new String("haha");
		String s2 = new String("hehe");
		Flyweight f1 = factory.getFlyweight(s1);
		Flyweight f2 = factory.getFlyweight(s2);
		Flyweight f3 = factory.getFlyweight(s1);
		f1.operation("f1");
		f2.operation("f2");
		f3.operation("f3");
		System.out.println(f1 == f3);
		System.out.println(factory.getFactorySize());
		System.out.println();
		
		/* ∏¥∫œœÌ‘™≤‚ ‘ */
		Set<String> states = new HashSet<String>();
		states.add("haha");
		states.add("hehe");
		Flyweight fc1 = factory.getFlyweight(states);
		Flyweight fc2 = factory.getFlyweight(states);
		fc1.operation("fc1");
		fc2.operation("fc2");
		System.out.println(f1 == f2);
		System.out.println(factory.getFactorySize());
	}
}
