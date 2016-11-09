package activeobject;

import activeobject.activeobject.ActiveObject;
import activeobject.activeobject.Result;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:12
 */
public class MarkerClientThread extends Thread{
    private final ActiveObject activeObject;
    private final char fillChar;

    public MarkerClientThread(String name, ActiveObject activeObject){
        super(name);
        this.activeObject = activeObject;
        this.fillChar = name.charAt(0);
    }

    @Override
    public void run() {
        try{
            for(int i = 0; true; i++){
                Result result = activeObject.makeString(i, fillChar);
                Thread.sleep(10);
                String value = (String)result.getResultValue();
                System.out.println(Thread.currentThread().getName() + ": value=" + value);
            }
        }catch (InterruptedException e){

        }
    }
}
