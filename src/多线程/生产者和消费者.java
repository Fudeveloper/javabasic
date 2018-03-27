package 多线程;

/**
 * Class 生产者和消费者 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 生产者和消费者 {
    public static void main(String[] args) {
        Hamker hamker = new Hamker();
        Hassistance hassistance = new Hassistance();

        hamker.setName("jia");
        hamker.start();
        hassistance.start();
    }
}

// 生产者
class Hamker extends Thread {
    public void make() {
        synchronized (ham.box) {
            ham.production++;
            ham.box.notify();
        }
    }

    @Override
    public void run() {
        super.run();
//        不断生产
        while (ham.production < ham.totalMaterial) {
//            只要有ham，厨师就可以通知营业员可以卖了
            if (ham.production > 0) {
                System.out.println("厨师" + this.getName() + ":" + "汉堡包来了" + (ham.production - ham.sales) + "个");
            }
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            make();
        }
    }
}

class Hassistance extends Thread {
    @Override
    public void run() {
//        当盒子里有汉堡包得时候不断卖
        while (ham.sales < ham.production) {
            try {
                sleep(1000);
            } catch (Exception e) {

            }
            sell();
        }
    }

    public void sell() {
        if (ham.production == 0) {
            System.out.println("nothing");
        }

        try {
            ham.box.wait();
        } catch (Exception exception) {

        }
        ham.sales++;
        System.out.println("has，总共卖了" + ham.sales + "个");
    }
}