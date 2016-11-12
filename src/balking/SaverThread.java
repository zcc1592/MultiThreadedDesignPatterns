package balking;

import java.io.IOException;

/**
 * @Author: Jack
 * @Time: 2016-11-12 16:50
 */
public class SaverThread extends Thread {
    private Data data;

    public SaverThread(String name, Data data){
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true){
                data.save();
                sleep(1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
