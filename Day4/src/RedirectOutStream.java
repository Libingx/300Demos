import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Administrator on 13-7-24.
 * System类的setOut()和setIn()及setErr()方法
 */
public class RedirectOutStream {
    public static void main(String[] args) {

        try {
            PrintStream out = System.out;     //保存原输出流
            PrintStream ps = ps = new PrintStream("D:\\Download\\300Demos\\Day4\\src\\log.txt");//新建输出流
            System.setOut(ps);
            int age = 10;
            System.out.println("定义年龄变量，初值为10");
            String sex = "女";
            System.out.println("定义性别变量，初值为女");
            String info = "这个"+sex+"人"+age+"岁了。";
            System.out.println("info整合使用sex和age变量:"+info);
            System.setOut(out);
            System.out.println("改变输出流实验结束");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
