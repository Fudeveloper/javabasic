package 反射;

import java.lang.reflect.Field;

public class aa {
    public static void main(String[] args) throws IllegalAccessException {
        Point point = new Point(1, 2);
        Field[] fields = point.getClass().getFields();

        for (Field field : fields) {
            if (field.getType() == String.class) {
//                获得字段数据
                String s = (String) field.get(point);
                System.out.println(s);
//                 更改字段数据
                field.set(point, "aaa");
            }
        }
        System.out.println(point);
    }
}
