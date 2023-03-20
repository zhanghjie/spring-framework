package org.springframework.zhj.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * CglibProxyDemo
 * 功能描述：CglibProxyDemo
 *
 * @author zhanghaojie
 * @date 2023/3/13 14:37
 */
public class CglibProxyDemo {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/zhanghaojie/Downloads/");


        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new HelloServiceInterceptor());


        HelloService helloServiceProxy = (HelloService) enhancer.create();
        String say = helloServiceProxy.say();
        System.out.println("helloServiceProxy return:" + say);
    }
}
