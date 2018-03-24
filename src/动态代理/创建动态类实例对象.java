package 动态代理;


import java.lang.reflect.*;
import java.util.Collection;

public class 创建动态类实例对象 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        获取动态类字节码
        Class<?> proxyClass = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);

//       获取相关参数构造函数
//        关于InvocationHandler类型的类
        class MyInvocationHandler1 implements InvocationHandler{

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return "123";
            }
        }
//        利用构造函数实例化动态类
        Collection collection = (Collection) constructor.newInstance(new MyInvocationHandler1());
        System.out.println(collection);

//        利用匿名类的方式实例化动态类
        Collection collection1 = (Collection)constructor.newInstance(new MyInvocationHandler1(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
                return "456";
            }
        });
        System.out.println(collection1);

    }
}
