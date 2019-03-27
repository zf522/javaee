/**
 * FileName: _Buffered_ex01
 * Author:   16681
 * Date:     2019/3/23 17:12
 * Description: 题目：
 * 定义一个集合用于存储多个字符串，向其中添加一些字符串，
 * 然后将集合的所有字符串写到文件中。要求每个字符串独占一行。
 */
package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class _Buffered_ex01 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");
        System.out.println(arrayList);
        FileWriter fileWriter =new FileWriter("Buffered_ex01.txt");
        BufferedWriter bufferedWriter  = new BufferedWriter(fileWriter);
        for (int i = 0; i <arrayList.size() ; i++) {
            bufferedWriter.write( arrayList.get(i));
            bufferedWriter.newLine();

        }
        bufferedWriter.close();
    }
}
