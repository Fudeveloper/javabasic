package 输入与输出;

import java.io.*;

/**
 * Class 增强的多字节输出流DataOutput ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 增强的多字节输出流DataOutput {
    public static void main(String[] args) throws IOException {
        File file =new File("1.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream =new DataOutputStream(fileOutputStream);

        dataOutputStream.writeUTF("啊啊");
        dataOutputStream.close();
    }
}
