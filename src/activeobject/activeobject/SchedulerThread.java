package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:15
 */
public class SchedulerThread extends Thread{
    private final ActivationQueue queue;
    public SchedulerThread(ActivationQueue queue){
        this.queue = queue;
    }

    public void invoke(MethodRequest request){
        queue.putRequest(request);
    }

    @Override
    public void run() {
        while (true){
            MethodRequest request = queue.takeRequest();
            request.execute();
        }
    }
}
