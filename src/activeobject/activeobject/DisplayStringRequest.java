package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:17
 */
public class DisplayStringRequest extends MethodRequest{
    private String string;

    public DisplayStringRequest(Servant servant, String string){
        super(servant, null);
        this.string = string;
    }

    @Override
    public void execute() {
        servant.displayString(string);
    }
}
