package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:18
 */
public class RealResult extends Result{
    private final Object resultValue;
    public RealResult(Object resultValue){
        this.resultValue = resultValue;
    }
    @Override
    public Object getResultValue() {
        return resultValue;
    }
}
