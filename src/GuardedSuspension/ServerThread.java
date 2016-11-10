package GuardedSuspension;

import java.util.Random;

/**
 * @Author: Jack
 * @Time: 2016-11-10 17:32
 */
public class ServerThread extends Thread{
    private Random random;
    private RequestQueue queue;

    public ServerThread(RequestQueue queue, String name, long seed){
        super(name);
        this.queue = queue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            Request request = this.queue.getRequest();
            System.out.println(Thread.currentThread().getName() + " handle " + request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {

            }
        }
    }
}
