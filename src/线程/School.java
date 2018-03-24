package 线程;

//创建一个学校的接口
public interface School {

    void set(String schoolName, String grade);

    String getSchool();

    String getGrade();

}

//创建一个学生类，实现接口内的方法
class Student implements School,Runnable {
    private String schoolName;
    private String grade;
    private String studentName;
    private String studentCode;
    private String studentSexy;
    private String studentCourse;
    private String studentAvg;


    public Student(String schoolName, String grade, String studentName, String studentCode, String studentSexy) {
        this.schoolName = schoolName;
        this.grade = grade;
        this.studentName = studentName;
        this.studentCode = studentCode;
        this.studentSexy = studentSexy;
        this.studentCourse = studentCourse;
        this.studentAvg = studentAvg;
        this.toString();
    }

    @Override
    public void set(String schoolName, String grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    @Override
    public String getSchool() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", grade='" + grade + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentCode='" + studentCode + '\'' +
                ", studentSexy='" + studentSexy + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                ", studentAvg='" + studentAvg + '\'' +
                '}';
    }

    @Override
    public String getGrade() {
        return this.grade;
    }

    @Override
    public void run() {
        System.out.println("123");
        this.toString();
    }
}

//创建以恶搞教师类，实现了学校这个接口，并让其成为线程类
class Teacher implements School, Runnable {
    private String schoolName;
    private String grade;
    private String teacherName;
    private String teacherCode;
    private String teacherSexy;
    private String teacherCourse;
    private String teacherSalary;

    public Teacher(String schoolName, String teacherName, String teacherCode) {
        this.schoolName = schoolName;
        this.grade = grade;
        this.teacherName = teacherName;
        this.teacherCode = teacherCode;
        this.toString();

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "schoolName='" + schoolName + '\'' +
                ", grade='" + grade + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                ", teacherSexy='" + teacherSexy + '\'' +
                ", teacherCourse='" + teacherCourse + '\'' +
                ", teacherSalary='" + teacherSalary + '\'' +
                '}';
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void set(String schoolName, String grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    @Override
    public String getSchool() {
        return this.schoolName;
    }

    @Override
    public String getGrade() {
        return this.grade;
    }
}

