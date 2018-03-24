package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Class 动态代理类的设计模式 ...
 *
 * @author lik
 * Created on 2018/3/23
 */
public class 动态代理类的设计模式 {
    public static void main(String[] args) {
//        创建动态代理类对象
        ProxyHand proxyHand = new ProxyHand(new AdivceImp());
//        实例化动态代理类对象
        IHello hello = (IHello) proxyHand.bind(new HelloImp());
        hello.toHello("abc");

// before
//abc
//after
    }
}

interface IHello {
    void toHello(String name);
}

class HelloImp implements IHello {

    @Override
    public void toHello(String name) {
        System.out.println(name);
    }
}

//拦截方法接口
interface IAdivce {
    public void beforeMethod();

    public void afterMethod();

}

//拦截方法类
class AdivceImp implements IAdivce {

    @Override
    public void beforeMethod() {
        System.out.println("before");
    }

    @Override
    public void afterMethod() {
        System.out.println("after");

    }
}

//代理类
class ProxyHand implements InvocationHandler {

    private Object target;
    private IAdivce adivce;

    public ProxyHand(IAdivce adivce) {
        this.adivce = adivce;
    }

    public Object bind(Object target) {
        this.target = target;
//        通过Proxy的静态方法获取实例对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    ;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        adivce.beforeMethod();
        Object result = method.invoke(target, args);
        adivce.afterMethod();
        return result;
    }
}


