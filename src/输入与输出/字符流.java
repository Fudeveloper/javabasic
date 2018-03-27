package 输入与输出;

import java.io.*;

/**
 * Class 字符流 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 字符流 {
    public static void main(String[] args) throws IOException {
        File f = new File("2.txt");
        FileInputStream fileInputStream = new FileInputStream(f);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        char st = (char) inputStreamReader.read();
        System.out.println(st);

//        BufferedReader 使用
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}


