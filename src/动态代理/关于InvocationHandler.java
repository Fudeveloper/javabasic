package 动态代理;

import java.lang.reflect.*;
import java.util.Collection;

public class 关于InvocationHandler {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> proxyClass = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);

        class MyivHandler implements InvocationHandler{
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return "123";
            }
        }

        Collection collection= (Collection) constructor.newInstance(new MyivHandler());
        System.out.println(collection);
//123
    }
}
