/**
 * Created by sun on 13-7-25.
 */
public class OutPutDemo implements Runnable {
    private Resource r;

    public OutPutDemo(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.out();
        }
    }
}
