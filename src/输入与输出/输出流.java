package 输入与输出;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Class 输出流 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 输出流 {
    public static void main(String[] args) throws IOException {
        File file = new File("fileout.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 'a'; i < 'z'; i++) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();


    }
}
