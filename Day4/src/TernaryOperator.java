import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        int num = scanner.nextInt();
//        String comment = num%2==0?"是一个偶数":"是一个奇数";
//        System.out.println(comment);
        Hello hello = new Hello();
//        System.out.println("请输入一个年份：");
//        int year = scanner.nextInt();
//        hello.isALeapYear(year);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        hello.checkLogin(username,password);

    }
}
