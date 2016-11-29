package ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: Jack
 * @Time: 2016-11-16 15:38
 */
public class Main {

    public static void main(String[] args){
        Data data = new Data(10);

        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();


        new WriterThread(data, "ABCDEFGHIJKLMNOPQRSTUVWXYZ").start();
        new WriterThread(data, "abcdefghijklmnopqrstuvwxyz").start();
    }

}
