package 输入与输出;

import java.io.*;

/**
 * Class BufferWriter使用 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class BufferWriter使用 {
    public static void main(String[] args) throws IOException {
        File file = new File("2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("aaa");
        bufferedWriter.newLine();
        bufferedWriter.write("bbb");
        bufferedWriter.close();


    }
}
