/**
 * FileName: _copy
 * Author:   16681
 * Date:     2019/3/23 17:00
 * Description:
 */
package IO;

import java.io.*;

public class _copy {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("BufferedReader.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        FileReader fileReader = new FileReader("BufferedWriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
