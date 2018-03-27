package 输入与输出;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Class 流 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 输入流 {
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");
        FileInputStream fileInputStream = new FileInputStream(f);
//        System.out.println(fileInputStream.read());
        char ch;
        for (int i = 0; i < f.length(); i++) {
            ch = (char) fileInputStream.read();
            System.out.println(ch);
        }
        fileInputStream.close();


    }
}
