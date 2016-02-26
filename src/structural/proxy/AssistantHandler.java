package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Dynamic proxy.
 * @author che
 *
 */
public class AssistantHandler implements InvocationHandler {

	private Object subject;		// 弱化目标对象类型，实现动态代理 
	
	public Object createProxy(Object subject) {
		this.subject = subject;
		Class<? extends Object> cls = subject.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object res = null;
		System.out.println("Dynamic assistant help.");
		res = method.invoke(this.subject, args);
		return res;
	}

}
