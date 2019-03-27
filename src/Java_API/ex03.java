/**
 * FileName: ex03
 * Author:   16681
 * Date:     2019/3/22 15:40
 * Description: 字符串的替换和去除空格操作
 */
package Java_API;

public class ex03 {
    public static void main(String[] args) {
        String string = " i t c a s t ";
        System.out.println(string.replace(" i t "," c n . i t "));
        System.out.println(string.trim());
        System.out.println(string.replace(" ",""));
        String s = "i-t-c-a-s-t";
        String[] chars = s.split("-");
        for (int i = 0; i < chars.length; i++) {
            if (i!=chars.length-1){
                System.out.print(chars[i]+",");
            }else{
                System.out.println(chars[i]);
            }

        }
    }


}
