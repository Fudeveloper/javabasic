package 线程;

/**
 * Class School1 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class School1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("小明", "女", "英语");
        teacher.set("上海", "三年级");
        Thread thread = new Thread(teacher);
        Student student = new Student("小明", "233", "女", "英语", "女");
        thread.start();
        Thread thread1 = new Thread(student);
        thread1.start();


    }
}
