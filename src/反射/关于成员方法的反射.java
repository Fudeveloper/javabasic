package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class 关于成员方法的反射 ...
 *
 * @author lik
 * Created on 2018/3/22
 */
public class 关于成员方法的反射 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
         * 普通方法的反射*/
        //        获取方法对象
        Method charAt = String.class.getMethod("charAt", int.class);
        String s1 = "abcdef";
//        调用方法
        System.out.println(charAt.invoke(s1, 1));
//        b


        /*静态方法的反射*/
        Method say = Point.class.getMethod("say", String[].class);
        say.invoke(null,(Object) new String[]{"aaa","bbb","ccc"});

    }
}
