/**
 * Created by Administrator on 13-8-1.
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][]; //杨辉三角存入一个二维数组
        for (int i = 0; i < triangle.length; i++) {//遍历第一层
            triangle[i] = new int[i + 1];  //初始化第二层
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
