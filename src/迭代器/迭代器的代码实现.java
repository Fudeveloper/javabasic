//package 迭代器;
//
//import java.util.ConcurrentModificationException;
//import java.util.NoSuchElementException;
//
///**
// * Class 迭代器的代码实现 ...
// *
// * @author lik
// * Created on 2018/3/26
// */
//public class 迭代器的代码实现 {
//    public static void main(String[] args) {
//
//    }
//
//}
//
//interface Iterator {
//    boolean hasNext();
//
//    Object next();
//
//    void remove();
//}
//
//abstract class AbstractList implements Iterator {
//    public Iterator iterator() {
//        return new Itr();
//    }
//
//}
//
//class Itr implements Iterator {
//    int modCount;
//    int cursor = 0;
//    int lastRet = -1;
//    int expectEdmodCount = mod
//
//    @Override
//    public boolean hasNext() {
//        return cursor != this.size();
//    }
//
//    @Override
//    public Object next() {
//        checkForComodification();
//        try {
//            Object next =
//        } catch (IndexOutOfBoundsException e) {
//            checkForComodification();
//            throw new NoSuchElementException();
//        }
//    }
//
//    @Override
//    public void remove() {
//        if (lastRet == -1) {
//                throw new IllegalStateException();
//                checkForComodification();
//        }
//        try {
//            AbstractList.this.remove(lastRet);
//        }
//    }
//
//    final void checkForComodification() {
//        if (modCount != expectEdmodCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//}