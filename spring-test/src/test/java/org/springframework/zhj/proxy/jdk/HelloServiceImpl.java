package org.springframework.zhj.proxy.jdk;

/**
 * HelloServiceImpl
 * 功能描述：HelloService
 *
 * @author zhanghaojie
 * @date 2023/3/9 14:40
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String say() {
        String word = "HelloServiceImpl ---- Hello world";
        System.out.println(word);
        return word;
    }
}
