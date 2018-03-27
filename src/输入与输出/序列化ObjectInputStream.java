package 输入与输出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Class 序列化ObjectInputStream ...
 *
 * @author lik
 * Created on 2018/3/25
 */
public class 序列化ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student)objectInputStream.readObject();
        System.out.println(student.age+student.name);



    }
}
