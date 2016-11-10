package activeobject;

import activeobject.activeobject.ActiveObject;
import activeobject.activeobject.ActiveObjectFactory;

/**
 * main
 * @Author: Jack
 * @Time: 2016-11-05 17:11
 */
public class Main {
    public static void main(String[] args){
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MarkerClientThread("Alice", activeObject).start();
        new MarkerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
        new AddClientThread("Diana", activeObject).start();
    }
}
