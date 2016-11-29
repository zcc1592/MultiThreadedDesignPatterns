package ReadWriteLock;

/**
 * @Author: Jack
 * @Time: 2016-11-16 15:39
 */
public class Data {

    private final char[] buffer;
    private final ReadWriteLock lock = new ReadWriteLock();

    public Data(int size){
        buffer = new char[size];
        for(int i = 0; i < buffer.length; i++){
            buffer[i] = '*';
        }
    }

    public char[] read() throws InterruptedException{
        lock.readLock();
        try{
            return doRead();
        }finally {
            lock.readUnlock();
        }

    }

    private char[] doRead(){
        char[] newBuffer = new char[buffer.length];
        for(int i = 0; i < buffer.length; i++){
            newBuffer[i] = buffer[i];
        }
        slowly();
        return newBuffer;
    }


    public void write(char c) throws InterruptedException{
        lock.writeLock();
        try{
            doWrite(c);
        }finally {
            lock.writeUnlock();
        }
    }

    private void doWrite(char c){
        for(int i = 0; i < buffer.length; i++){
            buffer[i] = c;
            slowly();
        }
    }

    private void slowly(){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
