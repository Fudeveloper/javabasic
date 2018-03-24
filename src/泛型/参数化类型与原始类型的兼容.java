package 泛型;

import java.util.ArrayList;
import java.util.Vector;

public class 参数化类型与原始类型的兼容 {

    public static void main(String[] args) {

//        参数化类型与原始类型的兼容
        Vector<String> vector = new Vector<>();
        Vector vector2 = new Vector();

//        参数化类型无继承性
//        Vector<Object> vector3 = vector ;

        vector2.add(new Object());
        System.out.println(vector2.get(0).toString());

//        泛型的“去类型”特性：编译成功后，会去掉类型信息
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        arrayList.add("a");
        integers.add(1);

        boolean equals = arrayList.getClass().equals(integers.getClass());
        System.out.println("两个list使用同一份字节码" + equals);
    }
}
