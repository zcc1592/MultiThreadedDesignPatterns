package activeobject;

import activeobject.activeobject.ActiveObject;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:12
 */
public class DisplayClientThread extends Thread{

    private final ActiveObject activeObject;


    public DisplayClientThread(String name, ActiveObject activeObject){
        super(name);
        this.activeObject = activeObject;
    }

    @Override
    public void run() {
        try{
            for(int i = 0; true; i++){
                String string = Thread.currentThread().getName() + " " + i;
                activeObject.displayString(string);
                Thread.sleep(200);
            }
        }catch (InterruptedException e){

        }
    }
}
