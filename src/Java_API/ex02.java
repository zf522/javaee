/**
 * FileName: ex02
 * Author:   16681
 * Date:     2019/3/22 15:32
 * Description: 字符串的转换操作
 */
package Java_API;

public class ex02 {
    public static void main(String[] args) {
        String s = "itcast";
        char[] chararry = s.toCharArray();
        for (int i = 0; i < chararry.length; i++) {
            if (i != chararry.length-1) {
                System.out.print(chararry[i] + ", ");
            } else {
                System.out.println(chararry[i]);
            }
        }
        System.out.println(s.valueOf(10));
        System.out.print(s.toUpperCase());
    }
}
