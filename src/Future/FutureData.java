package Future;

/**
 * @Author: Jack
 * @Time: 2016-11-30 17:38
 */
public class FutureData implements Data {

    private RealData realData = null;
    private boolean ready = false;

    public synchronized void setRealData(RealData realData){
        if(ready){
            return;
        }
        this.realData = realData;
        this.ready = true;
        notifyAll();
    }

    //wait notify 必须先获取对象锁
    @Override
    public synchronized String getContent() {
        while(!ready){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return this.realData.getContent();
    }
}
