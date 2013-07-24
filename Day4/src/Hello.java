
/**
 * Created by sun on 13-7-24.
 */
public class Hello {

    public void isALeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }

    public void checkLogin(String username, String password) {
        /**
         * 多个分支语句练习
         */
        if (!username.equals("sun")) {
            System.err.println("用户名输入错误！");
        } else if (!password.equals("sun")) {
            System.err.println("密码错误！");
        } else
            System.out.println("欢迎您" + username + "先生");
    }
}
