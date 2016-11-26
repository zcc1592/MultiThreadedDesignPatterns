package ThreadPerMessage;

/**
 * @Author: Jack
 * @Time: 2016-11-26 17:03
 */
public class Main {
    public static void main(String[] args){
        System.out.println("main Begin");
        Host host = new Host();
        host.request(10, 'A');
        host.request(20, 'B');
        host.request(30, 'C');
        System.out.println("main End");
    }
}
