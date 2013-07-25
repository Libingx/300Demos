import com.sun.xml.internal.ws.handler.ClientSOAPHandlerTube;

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

    public void valuePass(String  str){
        /* System.out.println("请输入一个数,i：");
        int i = scanner.nextInt();
        System.out.println("您输入的数为,i："+i);
        hello.valuePass(i);
        System.out.println("您输入的i经过方法调用后,i = "+i);
        System.out.println("传入i，i = "+i);
        i++;
        System.out.println("i自增后，i = "+i);
        */

        System.out.println("传入str，str = "+str);
        str += "您好！";
        System.out.println("i自增后，str = "+str);
    }

    public void refPass(Integer i){
        System.out.println("您传入"+i);
        i++;
        System.out.println("改变您传入的东西"+i);
    }
    public void finalRelatedTest(){
        final StringBuffer stringBuffer = new StringBuffer("sun");
        System.out.println("final 引用不能变，其值能变，stringBuffer为"+stringBuffer+"\r\n"+"append(\"sean\")后");
        stringBuffer.append("sean");
        System.out.println(stringBuffer+"当你试图改变这个引用时");
        stringBuffer = new StringBuffer("wen");

    }
}
