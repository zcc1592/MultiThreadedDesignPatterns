package ThreadPerMessage;

/**
 * @Author: Jack
 * @Time: 2016-11-26 16:56
 */
public class Helper {
    public void handle(int count, char c){
        System.out.println("handle("+count+", "+c+")Begin");
        for(int i = 0; i < count; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(c);
        }
        System.out.println();
        System.out.println("handle("+count+", "+c+")End");
    }
}
