package 线程;

/**
 * Class 线程 ...
 *
 * @author lik
 * Created on 2018/3/24
 */
public class 线程 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();

        //通过实现Runnable接口创建线程
        Computer computer = new Computer();
        Thread thread3 = new Thread(computer);
        thread3.start();
    }
}

//通过继承Thread类创建线程
class Thread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("thread1" + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread2" + i);
        }
    }
}

//通过实现Runnable接口创建线程
class Computer implements Runnable{

    @Override
    public void run() {
        System.out.println("computer");
    }
}
