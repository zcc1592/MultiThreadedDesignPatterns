package activeobject.activeobject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:13
 */
public interface ActiveObject {
    public abstract Result makeString(int count, char fillChar);
    public abstract void displayString(String string);
    public abstract Result add(String x, String y);

}
