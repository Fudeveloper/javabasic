package 面向对象;

import java.util.List;

public class StudentTest {

    /**
     * Method say ...
     *
     * @param s of type String
     */
    private static void say(String s) {
        System.out.println(s);
    }

    /**
     * Method main ...
     *
     * @param args of type String[]
     */
    public static void main(String[] args) {
        say("123");
        StudentTest.main(new String[]{"a","b"});

    }



}

