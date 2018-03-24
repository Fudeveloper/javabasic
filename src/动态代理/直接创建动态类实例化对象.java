package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/**
 * Class 直接创建动态类实例化对象 ...
 *
 * @author lik
 * Created on 2018/3/23
 */
public class 直接创建动态类实例化对象 {
    public static void main(String[] args) {
        Collection collection = (Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(), new Class[]{Collection.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
        System.out.println(collection);
    }
}
