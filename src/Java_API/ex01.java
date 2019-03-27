/**
 * FileName: ex01
 * Author:   16681
 * Date:     2019/3/22 15:27
 * Description: 字符串的基本操作
 */
package Java_API;

public class ex01 {
    public static void main(String[] args) {
        String string = "zxcvbnc";
        System.out.println("字符串的长度是： "+string.length());
        System.out.println("字符串中第一个字符是： "+string.charAt(0));
        System.out.println("c第一次出现的位置： "+string.indexOf("c"));
        System.out.println("c最后一次出现的位置： "+string.lastIndexOf("c"));
    }
}
