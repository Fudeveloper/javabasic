package 输入与输出;

import java.io.*;

/**
 * Class 增强的多字节输入流DataInput ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 增强的多字节输入流DataInput {
    public static void main(String[] args) throws IOException {
        File file =new File("1.dat");
        FileInputStream fileInputStream =new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        String s = dataInputStream.readUTF();
        System.out.println(s);
        dataInputStream.close();
    }
}
