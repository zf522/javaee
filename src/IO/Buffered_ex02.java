/**
 * FileName: Buffered_ex02
 * Author:   16681
 * Date:     2019/3/23 17:21
 * Description: 题目：
 * 与上一题相反，将文件中的字符串读取到集合中，并且每一行作为集合中的一个字符串元素。
 */
package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Buffered_ex02 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("Buffered_ex01.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
//        System.out.println(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
