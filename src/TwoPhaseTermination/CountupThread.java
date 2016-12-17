package TwoPhaseTermination;

/**
 * @Author: Jack
 * @Time: 2016-12-17 15:44
 */
public class CountupThread extends Thread {
    //计数器的值
    private long counter = 0;

    //已经送出终止请求则为true
    private volatile boolean shutdownRequested = false;

    public void shutdownRequest(){
        shutdownRequested = true;
        interrupt();
    }

    public boolean isShutdownRequested(){
        return shutdownRequested;
    }

    @Override
    public final void run() {
        try {
            while(!isShutdownRequested()){
                doWork();
            }
        } catch (InterruptedException e) {

        } finally {
            doShutdown();
        }
    }


    private void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);
        Thread.sleep(500);
    }

    private void doShutdown(){
        System.out.println("doShutdown: counter = " + counter);
    }

}
