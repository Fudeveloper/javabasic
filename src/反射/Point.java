package 反射;


public class Point {
    private int x;
    public int y;
    public String s1 = "aaabbbccc";
    public String s2 = "aaaabbbb";

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }


    public Point(int x, int y, String s1, String s2) {
        super();
        this.x = x;
        this.y = y;
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "关于成员字段的反射{" +
                "x=" + x +
                ", y=" + y +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }

    public static void say(String[] strings) {
        System.out.println("静态方法");
        for (String str : strings) {
            System.out.println(str);
        }
    }


}
