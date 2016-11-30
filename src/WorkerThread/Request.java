package WorkerThread;

import java.util.Random;

/**
 * @Author: Jack
 * @Time: 2016-11-29 17:48
 */
public class Request {
    private final String name;
    private final int number;
    private final static Random random = new Random();
    public Request(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void execute(){
        System.out.println(Thread.currentThread().getName() + " executes " + this);
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {

        }
    }

    public String toString(){
        return "[Requests from "+name+" No."+number+"]";
    }
}
