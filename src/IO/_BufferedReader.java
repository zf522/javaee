/**
 * FileName: _BufferedReader
 * Author:   16681
 * Date:     2019/3/23 16:45
 * Description:
 */
package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("BufferedWriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line =  bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
