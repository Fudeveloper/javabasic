package 输入与输出;

import java.io.File;
import java.io.IOException;

/**
 * Class 文件类 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 文件类 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile().getAbsolutePath());
        System.out.println(file.getPath());

//        file.createNewFile();
        if (file.isFile()) {
            System.out.println("isfile");
        }
        if (file.isDirectory()) {
            System.out.println("isdirectory");
        }
        if (file.exists()) {
            System.out.println("exists");
        }

//        列出文件夹内的所有文件
        File directory = new File("src");
        System.out.println(directory.isDirectory());
        File[] files = directory.listFiles();
        for (File file1:files ) {
            System.out.println(file1.getName());
        }

    }
}


