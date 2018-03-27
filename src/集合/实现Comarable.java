package 集合;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Class 实现Comarable ...
 *
 * @author lik
 * Created on 2018/3/25
 */
public class 实现Comarable {
    public static void main(String[] args) {
        Student student1 = new Student(6);
        Student student2 = new Student(1);
        Student student3 = new Student(9);
        Student student4 = new Student(22);

        Student[] students = new Student[]{student1, student2, student3, student4};
//        Arrays.sort(students);
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();

            }
        });
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age) {

        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        return st.age - this.age;

    }
}
