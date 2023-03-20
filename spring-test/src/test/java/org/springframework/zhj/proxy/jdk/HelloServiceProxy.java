package org.springframework.zhj.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * HelloServiceProxy
 * 功能描述：HelloServiceProxy
 *
 * @author zhanghaojie
 * @date 2023/3/9 14:42
 */
public class HelloServiceProxy {

    public static HelloService getProxy(final HelloService helloService) {
        ClassLoader classLoader = helloService.getClass().getClassLoader();
        Class<?>[] interfaces = helloService.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-----------before------------");
                Object invoke = method.invoke(helloService);
                System.out.println("-----------after------------");
                return invoke;
            }
        };
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return (HelloService) proxy;
    }

}
