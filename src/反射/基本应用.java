package 反射;

import java.util.Date;

/**
 * Class 反射 ...
 *
 * @author lik
 * Created on 2018/3/22
 */
public class 基本应用 {

    public static void main(String[] args) throws ClassNotFoundException {
        Date date = new Date();
        Class dataClass = date.getClass();
        System.out.println(dataClass);
        System.out.println(dataClass.getName());

        Class<?> aClass = Class.forName("java.util.Date");
        System.out.println(aClass.getName());

//        比较字节码是否相同
        System.out.println(dataClass.equals(aClass));
//        true

//        检测是否为基本类型
        System.out.println(String.class.isPrimitive());
//        false
        System.out.println(aClass.isPrimitive());
//        false
        System.out.println(int.class.isPrimitive());
//        true

//        检测是否为数组类型
        System.out.println(int[].class.isPrimitive());
//        false
        System.out.println(int[].class.isArray());
//        true


    }

}
