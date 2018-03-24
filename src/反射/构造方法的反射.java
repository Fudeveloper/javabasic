package 反射;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 构造方法的反射 {
    public static void main(String[] args) throws Exception {
        String s1 = new String(new StringBuffer("cjgong"));
        Constructor conS1 = String.class.getConstructor(StringBuffer.class);
        System.out.println(conS1);
        String s11 = (String) conS1.newInstance(new StringBuffer("cjgong"));
//        String s2 =(String)conS1.newInstance();


        System.out.println(s11);
//        String
    }
}
