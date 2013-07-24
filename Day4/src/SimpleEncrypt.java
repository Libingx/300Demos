import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 * 异或操作
 */
public class SimpleEncrypt {

    public static void main(String[] args) {
        System.out.println("password:");//提示输入
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("输入密码为："+password);
        char[] arrray = password.toCharArray();
        for (int i = 0; i < arrray.length;i++){
            arrray[i] = (char)(arrray[i]^5656);
        }
        String encryptPwd = arrray.toString();
        System.out.println("加密后"+encryptPwd);
    }

}
