package GuardedSuspension;

/**
 * @Author: Jack
 * @Time: 2016-11-10 17:36
 */
public class Main {
    public static void main(String[] args){
        RequestQueue queue = new RequestQueue();
        new ClientThread(queue, "Alice", 3141592L).start();
        new ServerThread(queue, "Bobby", 6535897L).start();
    }
}
