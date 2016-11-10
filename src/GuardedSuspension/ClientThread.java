package GuardedSuspension;

import java.util.Random;

/**
 * @Author: Jack
 * @Time: 2016-11-10 17:27
 */
public class ClientThread extends Thread{
    private Random random;
    private RequestQueue queue;

    public ClientThread(RequestQueue queue, String name, long seed){
        super(name);
        this.queue = queue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName() + " request " + request);
            this.queue.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {

            }
        }
    }
}
