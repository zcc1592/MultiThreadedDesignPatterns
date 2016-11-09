package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:17
 */
public class MakeStringRequest extends MethodRequest{
    private final int count;
    private final char fillchar;

    public MakeStringRequest(Servant servant, FutureResult future, int count, char fillchar){
        super(servant, future);
        this.count = count;
        this.fillchar = fillchar;
    }



    @Override
    public void execute() {
        Result result = servant.makeString(count, fillchar);
        future.setResult(result);
    }
}
