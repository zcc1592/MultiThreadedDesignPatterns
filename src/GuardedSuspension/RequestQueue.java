package GuardedSuspension;

import java.util.LinkedList;

/**
 * @Author: Jack
 * @Time: 2016-11-10 17:20
 */
public class RequestQueue {
    private final LinkedList<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest(){
        while(queue.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return queue.removeFirst();
    }

    public synchronized void putRequest(Request request){
        queue.addLast(request);
        notifyAll();
    }
}
