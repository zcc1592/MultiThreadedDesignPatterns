package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:13
 */
public class ActiveObjectFactory {

    public static ActiveObject createActiveObject(){
        Servant servant = new Servant();
        ActivationQueue queue = new ActivationQueue();
        SchedulerThread scheduler = new SchedulerThread(queue);
        Proxy proxy = new Proxy(scheduler, servant);
        scheduler.start();
        return proxy;
    }

}
