package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:15
 */
public abstract class MethodRequest {

    protected final Servant servant;
    protected final FutureResult future;

    public MethodRequest(Servant servant, FutureResult future){
        this.servant = servant;
        this.future = future;
    }

    public abstract void execute();

}
