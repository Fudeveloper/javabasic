package 反射;

import java.lang.reflect.Field;

public class 关于成员字段的反射 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Point point = new Point(3, 4);
//        Field fieldx = point.getClass().getField("x");
//        获取字段y的值
        Field fieldY = point.getClass().getField("y");
//        System.out.println(fieldx);

        System.out.println(fieldY.get(point));
//        获取private变量x的值
        Field fieldX = point.getClass().getDeclaredField("x");
//        改变字段的属性
        fieldX.setAccessible(true);

        change(point);
        System.out.println(point);
    }

    private static void change(Point point) throws IllegalAccessException {
        Field[] fields = point.getClass().getFields();
        for (Field field : fields) {
            System.out.println(field);
//            public int 反射.Point.y
//            public java.lang.String 反射.Point.s1
//            public java.lang.String 反射.Point.s2


//            通过反射改变字段中的字母
            if (field.getType().equals(String.class)) {
                String oldValue = (String) field.get(point);
                String newValue = oldValue.replace('a', 'b');

                field.set(point, newValue);
            }
        }
    }

}
