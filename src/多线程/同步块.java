package 多线程;

/**
 * Class 同步块 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 同步块 {
    public static void main(String[] args) {
        Compute2 a = new Compute2('a');
        Compute2 b = new Compute2('b');
        Compute2 c = new Compute2('c');
        a.start();
        b.start();
        c.start();
    }
}

class Compute2 extends Thread{
    char ch;
    static Object obj = new Object();

    public Compute2(char ch) {
        this.ch = ch;
    }


    @Override
    public void run() {
        synchronized (obj){
            for (int i = 0; i < 10; i++) {
                System.out.print(ch);
            }
        }
    }
}