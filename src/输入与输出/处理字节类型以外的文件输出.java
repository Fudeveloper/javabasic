package 输入与输出;

import java.io.*;

/**
 * Class 处理字节类型以外的文件输出 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 处理字节类型以外的文件输出 {
    public static void main(String[] args) throws Exception {
        File f = new File("1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
        for (int i = 'a'; i < 'z'; i++) {
            filterOutputStream.write(i);
        }
        fileOutputStream.close();
        filterOutputStream.close();
    }
}


