package 输入与输出;

import java.io.*;

/**
 * Class 序列化ObjectOutputStream ...
 *
 * @author lik
 * Created on 2018/3/25
 */
public class 序列化ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);

        Student student = new Student();
        student.age =6;
        student.name ="aaa";

        objectOutputStream.writeObject(student);
    }
}

/**
 * Class Student ...
 *
 * @author lik
 * Created on 2018/3/25
 */
class Student implements Serializable{
    /** Field name  */
    String name;
    /** Field age  */
    int age;
}