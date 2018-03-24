
/**
 * @author lik
 */
public class 字符串处理 {
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99};
        String s = new String(bytes);
        System.out.println(s);

//        获取指定字节数的构造器
        byte[] b = {97, 98, 99, 100, 101, 102};
        String s1 = new String(b, 2, 3);
        System.out.println(s1);

//        字符数组的构造器
        char[] c = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        String string = new String(c);
        System.out.println(string);

//          截取部分字符串数组的构造器
        String string2 = new String(c, 3, 2);
        System.out.println(string);

//        concat方法连接两个字符串
        String str1 = "abc";
        String str2 = "bbb";
        System.out.println(str1.concat(str2));

//        提取子字符串
        String str3 = "abcdeff";
//        从2开始，到最后
        System.out.println(str3.substring(2));
//        从2开始，到第5个
        System.out.println(str3.substring(2, 5));


//        从字符串中分解字符
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

//        测试字符串相等
        String str4 = "123";
        System.out.println("123".equals(str4));

//        忽略大小写比较字符串
        String str5 = "Abc";
        System.out.println("abc".equalsIgnoreCase(str5));

//        查找特定字串
        String str6 = "qwertyuiop";
        System.out.println(str6.indexOf("u"));
//        6

        System.out.println(str6.startsWith("q"));
//        true
        System.out.println(str6.endsWith("p"));
//        true

//        缓冲字符串处理类
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
//        容量 16
        System.out.println(sb1.length());
//        0

//        设定容量大小的构造器
        StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb2.capacity());
//        容量 100
        System.out.println(sb2.length());
//        0

        StringBuffer sb3 = new StringBuffer("小明是个优秀的");
//        设置缓冲字符串对象的长度
        sb3.setLength(3);
        System.out.println(sb3);
//      小明是

//        取字符串的单个字符
        System.out.println(sb3.charAt(1));
//        明

//        单个字符串赋值
        sb3.setCharAt(1,'a');
        System.out.println(sb3);
//        小a是

//        指定位置插入字符串
        sb3.insert(1,"程序员");
        System.out.println(sb3);
//        小程序员a是

//        倒置字符串的内容：
        sb3.reverse();
        System.out.println(sb3);
//        是a员序程小

//        将int转为String有两种方法
        String s2 = String.valueOf(123);
        System.out.println(s2);

        String s3 = Integer.toString(678);
        System.out.println(s3);
    }
}
