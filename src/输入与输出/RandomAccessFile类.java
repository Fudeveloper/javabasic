package 输入与输出;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Class RandomAccessFile类 ...
 *
 * @author lik
 * Created on 2018/3/25
 */
public class RandomAccessFile类 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("2.txt", "rw");
        long lo = randomAccessFile.length();
//        文件尾写入
        randomAccessFile.seek(lo);
        randomAccessFile.writeUTF("hello");

//        文件头写入
        randomAccessFile.seek(0);
        randomAccessFile.writeUTF("head");
        randomAccessFile.close();
    }
}
