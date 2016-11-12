package balking;

/**
 * @Author: Jack
 * @Time: 2016-11-12 16:51
 */
public class Main {
    public static void main(String[] args){
        Data data = new Data("data.txt", "");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
