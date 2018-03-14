package com.cn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyFactory implements InvocationHandler {

	private Object target;
	public JdkProxyFactory(Object target){
		this.target = target;
	}
	
	public Object getProxyObject(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	//参数1：代理后的对象，参数2：目标对象原来的方法，参数3：目标对象方法的参数的值
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置增强了");
		if(method.getName().equals("sleep")){
			System.out.println("针对睡觉这个方法前置增强了。。。");
		}
		//执行原来的方法
		Object object = method.invoke(target, args);
		if(object == target){
			System.out.println("同一个对象");
		}
		if(method.getName().equals("eat")){
			System.out.println("专门对吃方法进行了后置增强了");
		}
		return object;
	}

}
