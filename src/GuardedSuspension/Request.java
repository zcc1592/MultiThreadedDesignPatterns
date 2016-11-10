package GuardedSuspension;

/**
 * @Author: Jack
 * @Time: 2016-11-10 17:18
 */
public class Request {
    private final String name;
    public Request(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "[Request "+name+" ]";
    }
}
