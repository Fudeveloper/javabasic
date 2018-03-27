package 多线程;

/**
 * Class 生产者和多消费者 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 生产者和多消费者 {
    public static void main(String[] args) {
        Hmaker2 hmaker2 = new Hmaker2();
        Hassistant2 hassistance1 = new Hassistant2();
        Hassistant2 hassistance2 = new Hassistant2();

        hmaker2.setName("甲");
        hassistance1.setName("甲");
        hassistance2.setName("乙");

        hmaker2.start();
        hassistance1.start();
        hassistance2.start();
    }
}

//重新设计厨师类
class Hmaker2 extends Thread {
    //    make 方法使用了一个同步块，在这个函数里会不断地产生汉堡包
    public void make() {
        synchronized (ham2.box) {
            ham2.production++;
            System.out.println("厨师" + getName() + ":" + "汉堡包来了（总共）" + (ham2.production - ham2.sales1 - ham2.sales2) + "个");
            ham2.box.notify();
        }
    }

    @Override
    public void run() {
        while ((ham2.sales1+ham2.sales2) < ham2.totalMaterial) {
            make();
            try {
                sleep(3000);
            } catch (InterruptedException e) {

            }
            make();
        }
    }

}

//重新设计营业员类
class Hassistant2 extends Thread {
    public void sell1() throws InterruptedException {
        if (ham2.production == (ham2.sales1 + ham2.sales2)) {
            System.out.println("营业员" + getName() + "顾客们，汉堡包没有了");
            ham2.sales1 = 0;
            ham2.production = 0;
            ham.box.wait();
        }else{
            ham2.sales1++;
            System.out.println("营业员" + getName() + "汉堡包上来了，总共卖了" + ham2.sales1 + "个");
        }

    }

    public void sell2() throws InterruptedException {
        if (ham2.production == (ham2.sales1 + ham2.sales2)) {
            System.out.println("营业员" + getName() + ":汉堡包没了");
            ham2.sales2 = 0;
            ham2.production = 0;
            ham2.box.wait();

        }else {
            ham2.sales2++;
            System.out.println("营业员" + getName() + "汉堡包上来了，总共卖了" + ham2.sales2 + "个");
        }

    }

    @Override
    public void run() {
        while ((ham2.sales1 + ham2.sales2) < ham2.production) {
            try {
                sell1();
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        while ((ham2.sales1 + ham2.sales2) < ham.production) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sell2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class ham2 {
    static final Object box = new Object();
    static int totalMaterial = 10;
    static int production = 5;
    static int sales1 = 0;
    static int sales2 = 0;

}
