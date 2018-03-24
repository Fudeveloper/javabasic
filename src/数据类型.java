/**
 * @author lik
 */
public class 数据类型 {

    public static final int X = 1;


    public static void main(String[] args) {

        byte a = 1;
        short b = 1;
        float f1 = 1F;
        float f = 1f;
        double d = 1d;
        double d1 = 1D;
        int i = 1;
        long l = 1L;

        Var0 var = new Var0();
        System.out.println(var.m);

        int aa = 10;
        float ff = 10f;
//        系统自动转化为精度更高的数据类型
        System.out.println(aa + ff);

    }

    public static class Var0 {
        int m = 0;
    }

}
