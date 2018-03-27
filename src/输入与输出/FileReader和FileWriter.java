package 输入与输出;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class FileReader和FileWriter ...
 *
 * @author lik
 * Created on 2018/3/25
 */
public class FileReader和FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("2.txt");
        FileReader fileReader = new FileReader(file);
        char ch;
        for (int i = 0; i < file.length(); i++) {
            System.out.println((char) fileReader.read());
        }
//        System.out.println();
    }
}
