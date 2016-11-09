package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:14
 */
public class Proxy implements ActiveObject {

    private final Servant servant;
    private final SchedulerThread scheduler;

    public Proxy(SchedulerThread scheduler, Servant servant){
        this.scheduler = scheduler;
        this.servant = servant;
    }

    @Override
    public Result makeString(int count, char fillChar) {
        FutureResult future = new FutureResult();
        scheduler.invoke(new MakeStringRequest(servant, future, count, fillChar));
        return future;
    }

    @Override
    public void displayString(String string) {
        scheduler.invoke(new DisplayStringRequest(servant, string));
    }
}
