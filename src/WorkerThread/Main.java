package WorkerThread;

/**
 * @Author: Jack
 * @Time: 2016-11-29 17:43
 */
public class Main {
    public static void main(String[] args){
        Channel channel = new Channel(5);
        channel.startWorkers();
        new ClientThread("Alice", channel).start();
        new ClientThread("Bobby", channel).start();
        new ClientThread("Chris", channel).start();
    }
}
