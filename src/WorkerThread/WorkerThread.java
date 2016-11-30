package WorkerThread;

/**
 * @Author: Jack
 * @Time: 2016-11-29 17:57
 */
public class WorkerThread extends Thread {

    private final Channel channel;

    public WorkerThread(String name, Channel channel){
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while(true){
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
