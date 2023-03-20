package org.springframework.zhj.proxy.jdk;

/**
 * Test
 * 功能描述：TODO
 *
 * @author zhanghaojie
 * @date 2023/3/9 14:46
 */
public class Test {
    public static void main(String[] args) {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        HelloService helloService = HelloServiceProxy.getProxy(new HelloServiceImpl());
        helloService.say();
        System.out.println(helloService.getClass());
    }
}
