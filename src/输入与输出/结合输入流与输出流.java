package 输入与输出;

import java.io.*;

/**
 * Class 结合输入流与输出流 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 结合输入流与输出流 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        File existFile = new File("file.txt");
        FileInputStream fileInputStream = new FileInputStream(existFile);
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        byte[] bytes = new byte[1024];
        fileInputStream.read(bytes);
//        for (int i = 0; i < file.length(); i++) {
//            fileOutputStream.write(bytes);
//        }
        fileOutputStream.write(bytes);


        fileOutputStream.close();
        fileOutputStream.close();
//        int read = fileInputStream.read();
//        System.out.println(read);
    }
}
