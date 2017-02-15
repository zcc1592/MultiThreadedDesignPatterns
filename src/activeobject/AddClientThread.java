package activeobject;

import activeobject.activeobject.ActiveObject;
import activeobject.activeobject.Result;

/** AddClientThread
 * @Author: Jack
 * @Time: 2016-11-10 16:01
 */
public class AddClientThread extends Thread {
    private final ActiveObject activeObject;
    private String x = "1";
    private String y = "1";

    public AddClientThread(String name, ActiveObject activeObject){
        super(name);
        this.activeObject = activeObject;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; true; i++){
                Result result = activeObject.add(x, y);
                sleep(100);
                String z = (String)result.getResultValue();
                System.out.println(Thread.currentThread().getName() + ": " + x + "+" + y + "=" + z);
                x = y;
                y = z;
            }

        } catch (InterruptedException e) {

        }
    }
}
