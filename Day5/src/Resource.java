/**
 * Created by sun on 13-7-25.
 */
public class Resource {
    private String username;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String username,String sex){
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.username = username;
            this.sex = sex;
            flag = true;
            this.notify();

    }
    public synchronized void out(){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("姓名：" +username+ "..." + "性别：" +sex);
        flag = false;
        this.notify();

    }
}
