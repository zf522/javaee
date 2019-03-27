/**
 * FileName: _Buffered_ex03
 * Author:   16681
 * Date:     2019/3/24 8:08
 * Description: 藏头情诗
 */
package IO;

import java.io.*;
import java.util.ArrayList;

public class _Buffered_ex03 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("ex03.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        bufferedReader.close();
        FileWriter fileWriter = new FileWriter("ex03-1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
