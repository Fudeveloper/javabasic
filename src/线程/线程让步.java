package 线程;

/**
 * Class 线程让步 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 线程让步 {
    public static void main(String[] args) {
        Computer2 computer2 = new Computer2();
        Computer1 computer1 = new Computer1();
        computer1.start();
        computer2.start();

    }
}

class Computer1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            yield();
        }
    }
}

class Computer2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("这个数字是" + i);
        }
    }
}