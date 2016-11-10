package activeobject.activeobject;

import java.math.BigInteger;

/**
 * @Author: Jack
 * @Time: 2016-11-05 17:19
 */
public class Servant implements ActiveObject{
    @Override
    public Result makeString(int count, char fillChar) {
        char[] buffer = new char[count];
        for(int i = 0; i < count; i++){
            buffer[i] = fillChar;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        return new RealResult(new String(buffer));
    }

    @Override
    public void displayString(String string) {
        try {
            System.out.println("displayString: " + string);
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
    }

    @Override
    public Result add(String x, String y) {
        String value = null;
        try{
            BigInteger bigIntegerX = new BigInteger(x);
            BigInteger bigIntegerY = new BigInteger(y);
            value = bigIntegerX.add(bigIntegerY).toString();
        }catch (NumberFormatException e){

        }

        return new RealResult(value);
    }
}
