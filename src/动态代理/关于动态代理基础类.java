package 动态代理;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/**
 * Class 关于动态代理基础类 ...
 *
 * @author lik
 * Created on 2018/3/23
 */
public class 关于动态代理基础类 {
    public static void main(String[] args) {
//        获取代理类的字节码
        Class<?> proxyClass = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
        System.out.println(proxyClass.getName());
//        com.sun.proxy.$Proxy0

//      获取构造函数集
        Constructor<?>[] constructors = proxyClass.getConstructors();
        for (Constructor con : constructors) {
            String name = con.getName();
//            获取构造函数参数的类型
            Class[] parameterTypes = con.getParameterTypes();
            for (Class par : parameterTypes) {
                System.out.println(par.getName());
            }
        }
        System.out.println("方法的列表-----------");
        Method[] methods = proxyClass.getMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
        }
    }

}
