package 多线程;

/**
 * Class 同步化方法 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 同步化方法 {
    public static void main(String[] args) {
        Compute3 compute3=new Compute3();
        new Thread(compute3).start();
        new Thread(compute3).start();
        new Thread(compute3).start();
    }
}

class Compute3 extends Thread {
    int i = 10;
    static Object object = new Object();

    synchronized void print() {
        System.out.println(Thread.currentThread().getName() + ":" + i);
        i--;
    }

    @Override
    public void run() {
        while (this.i > 0) {
            print();
            try {
                sleep(1000);
            } catch (InterruptedException e) {


            }
        }
    }
}
