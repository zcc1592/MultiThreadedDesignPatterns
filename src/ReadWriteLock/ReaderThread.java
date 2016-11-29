package ReadWriteLock;

/**
 * @Author: Jack
 * @Time: 2016-11-16 15:39
 */
public class ReaderThread extends Thread{
    private final Data data;

    public ReaderThread(Data data){
        this.data = data;
    }


    @Override
    public void run() {

        try{
            while(true){
                char[] readbuf = data.read();
                System.out.println(Thread.currentThread().getName() + " read " + String.valueOf(readbuf));
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
