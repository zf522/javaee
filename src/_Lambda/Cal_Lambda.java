/**
 * FileName: Cal_Lambda
 * Author:   16681
 * Date:     2019/3/24 15:02
 * Description: 使用Lambda实现接口中的抽象方法
 */
package _Lambda;
/*
Lambda标准格式：
（ int a, int b ) -> { return a + b; }
 */
public class Cal_Lambda {
    public static void main(String[] args) {
        //传参式
        cal_method((int a, int b) -> {
            return a + b;
        });
        System.out.println("===========================");
        //赋值式
        Calculator param = (int a,int b) -> {return a+b;};
        cal_method(param);
    }

    public static void cal_method(Calculator calculator) {
        int result = calculator.sum(100, 200);
        System.out.println(result);
    }
}
