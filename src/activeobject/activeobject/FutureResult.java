package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:18
 */
public class FutureResult extends Result{
    private Result result;
    private boolean ready;

    public synchronized void setResult(Result result){
        this.result = result;
        this.ready = true;
        notifyAll();
    }

    @Override
    public synchronized Object getResultValue() {
        while (!ready){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return result.getResultValue();
    }
}
