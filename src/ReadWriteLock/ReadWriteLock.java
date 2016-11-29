package ReadWriteLock;

/**
 * @Author: Jack
 * @Time: 2016-11-16 15:40
 */
public class ReadWriteLock {
    //正在读取的线程数量
    private int readingReaders = 0;
    //正在等待写入的线程数量
    private int waitingWriters = 0;
    //正在写入的线程数量
    private int writingWriters = 0;
    //写入优先
    private boolean perferWriter = true;

    public synchronized void readLock() throws InterruptedException{
        while(writingWriters > 0 || (perferWriter && waitingWriters > 0)){
            wait();
        }
        readingReaders++;
    }


    public synchronized void readUnlock(){
        readingReaders--;
        perferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException{
        waitingWriters++;
        try{
            while(readingReaders > 0 || writingWriters > 0){
                wait();
            }
        }finally {
            waitingWriters--;
        }
        writingWriters++;
    }

    public synchronized void writeUnlock(){
        writingWriters--;
        perferWriter = false;
        notifyAll();
    }


}
