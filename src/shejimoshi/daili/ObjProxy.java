package shejimoshi.daili;

import com.sun.deploy.net.proxy.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 9:56 2021/3/17
 * @Modifued By:
 */
public class ObjProxy implements InvocationHandler {

    private Object object;

    public  ObjProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method  before");
        method.invoke(proxy,args);
        System.out.println("method  after");
        return null;
    }

    public static void main(String[] args) {

        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloInterface hello = new Hello();

        InvocationHandler handler = new ObjProxy(hello);

        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);

        proxyHello.sayHai();

    }
}