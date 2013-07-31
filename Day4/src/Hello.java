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
        } else {
            System.out.println("欢迎您" + username + "先生");
        }
    }

    /**
     * switch练习，switch只能用整型或字符型变量，不能用字符串，但我们可以用字符串的hashCode。
     * 写在main中的代码
     * Scanner scanner = new Scanner(System.in);
     * System.out.println("输入您的姓名");
     * String usrname = scanner.nextLine();
     * System.out.println("输入您擅长的语言：");
     * String language = scanner.nextLine();
     * Hello hello = new Hello();
     * hello.deptDivide(usrname,language);
     * <p/>
     * <p/>
     * switch用于商店打折，每增加200便长一个等级，等级grade = (int)money/200
     */
    public void deptDivide(String usrname, String language) {
        String tmpStr = language.toLowerCase();
        switch (tmpStr.hashCode()) {
            case 3254818:
                System.out.println(usrname + "被分到Java开发部门");
                break;
            case 96515:
                System.out.println(usrname + "您好，您被分到C++开发部门");
                break;
            case 3104:
                System.out.println(usrname + "您好，您被分到C#开发部门");
                break;
            default:
                System.out.println(usrname + "您好，我们公司不需要" + language + "语言的开发人员");
        }
    }

    /**
     * while 遍历数组。数组有length属性不是length()方法数组用{}存  o
     *  String[] seasons = {"春天","夏天","秋天","冬天"};
     *  hello.ergodicArray(seasons);
     */
    public void ergodicArray(String[] arr) {
        int index = 0;
        String tmpStr = "一年共有";
        while (index < arr.length) {
            tmpStr += arr[index]+"，";
            index++;
        }
        tmpStr += arr.length+"个季节。";
        System.out.println(tmpStr);
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

    }
}
