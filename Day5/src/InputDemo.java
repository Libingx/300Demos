/**
 * Created by sun on 13-7-25.
 */
public class InputDemo implements Runnable {
    Resource r = new Resource();

    public InputDemo(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {

            if (x == 0) {
                r.set("sun","male");
            } else {
                r.set("孙","男");
            }
            x = (x + 1) % 2;

        }
    }
}
