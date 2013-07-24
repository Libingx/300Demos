/**
 * Created by Administrator on 13-7-24.
 */
public class Swap {
    public void swap1(int m,int n){
        int tmp = 0;
        tmp = m;
        m = n;
        n = tmp;
        System.out.println("i = "+m+" j = "+n);
    }
    public void swap2(int m,int n){
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("i = "+m+" j = "+n);


    }
    public void swap3(int m,int n){
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("i = "+m+" j = "+n);

    }
    public static void main(String[] args) {
        Swap swap = new Swap();
        int i = 1;
        int j = 2;
        System.out.println("i = 1 \r\nj = 2");
        swap.swap1(i,j);
        System.out.println("swap1");
        swap.swap2(i,j);
        System.out.println("swap2");
        swap.swap3(i,j);
        System.out.println("swap3");



    }
}
