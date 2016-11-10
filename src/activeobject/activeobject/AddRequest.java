package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-10 16:09
 */
public class AddRequest extends MethodRequest{
    private final String x;
    private final String y;

    public AddRequest(Servant servant, FutureResult future, String x, String y){
        super(servant, future);
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        Result realResult = this.servant.add(x, y);
        this.future.setResult(realResult);
    }
}
