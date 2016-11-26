package ThreadPerMessage;

/**
 * @Author: Jack
 * @Time: 2016-11-26 17:00
 */
public class Host {
    private Helper helper = new Helper();
    public void request(final int count, final char c){
        System.out.println("request("+count+", "+c+")Begin");
        new Thread(){
            @Override
            public void run() {
                helper.handle(count, c);
            }
        }.start();
        System.out.println("request("+count+", "+c+")End");
    }
}
