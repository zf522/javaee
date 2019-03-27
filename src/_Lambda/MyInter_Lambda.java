/**
 * FileName: MyInter_Lambda
 * Author:   16681
 * Date:     2019/3/24 15:30
 * Description:
 */
package _Lambda;

public class MyInter_Lambda {
    public static void main(String[] args) {
        //标准格式：
        method((int x) -> {return ++x;});
        System.out.println("================");
        //简便格式：
        /*
        1.Lambda表达式中的参数类型可以省略
        2.如果只有一个参数，小括号可以省略
        3.如果只有一个语句，return、 花括号、 封号可以省略
         */
        method((x) -> ++x);
    }
    public static void method(MyInter myInter){
        int result = myInter.inter(20);
        System.out.println(result);

    }
}
