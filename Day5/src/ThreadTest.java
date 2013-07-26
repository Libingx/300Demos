/**
 * Created by sun on 13-7-25.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Resource r = new Resource();
        InputDemo in = new InputDemo(r);
        OutPutDemo ou = new OutPutDemo(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(ou);

        t1.start();
        t2.start();
    }

}
