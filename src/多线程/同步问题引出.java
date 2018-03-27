package 多线程;

/**
 * Class 同步问题引出 ...
 *
 * @author lik
 * Created on 2018/3/26
 */
public class 同步问题引出 {
    public static void main(String[] args) {
        Compute a = new Compute('a');
        Compute b = new Compute('b');
        a.start();
        b.start();
    }
}

class Compute extends Thread {
    char ch;

    public Compute(char ch) {
        this.ch = ch;
    }

    void print(char ch) {
        for (int i = 0; i < 10; i++) {
            System.out.print(ch);
        }
    }

    @Override
    public void run() {
        print(this.ch);
    }
}

