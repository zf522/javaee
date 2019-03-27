/**
 * FileName: _FileReader
 * Author:   16681
 * Date:     2019/3/23 16:18
 * Description: 字符流读取文件
 */
package IO;

import java.io.FileReader;
import java.io.IOException;

public class _FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("FileWriter.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
