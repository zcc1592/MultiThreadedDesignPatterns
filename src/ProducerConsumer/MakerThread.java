package ProducerConsumer;

import java.util.Random;

/**
 * @Author: Jack
 * @Time: 2016-11-15 15:48
 */
public class MakerThread extends Thread{
    private final Random random;
    private final Table table;
    private static int id = 0;
    public MakerThread(String name,Table table, long seed){
        super(name);
        this.table = table;
        random = new Random(seed);
    }

    @Override
    public void run() {
        try{
            while(true){
                Thread.sleep(random.nextInt(1000));
                String cake = "[Cake No."+nextId()+" by "+getName()+"]";
                table.put(cake);
            }
        }catch (InterruptedException e){

        }
    }

    public static synchronized int nextId(){
        return id++;
    }

}
