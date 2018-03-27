package 线程;

/**
 * Class 线程唤醒 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 线程唤醒 {
    public static void main(String[] args) {
        Compute compute = new Compute();
        compute.start();
        compute.interrupt();
    }
}

class Compute extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("slepping");
        try {
            sleep(1000);

        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("被唤醒");
        }
    }
}