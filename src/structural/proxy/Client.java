package structural.proxy;

public class Client {

	public static void main(String[] args) {
		Client c = new Client();
		c.staticProxy();
		c.dynamicProxy();
	}
	
	public void staticProxy() {
		Leader leader = new Assistant();
		leader.sign();
	}
	
	public void dynamicProxy() {
		AssistantHandler ah = new AssistantHandler();
		Leader leader = (Leader) ah.createProxy(new CEO());
		leader.sign();
		Leader leader2 = (Leader) ah.createProxy(new CTO());
		leader2.sign();
	}
}
