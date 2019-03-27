/**
 * FileName: _FileWriter
 * Author:   16681
 * Date:     2019/3/23 16:01
 * Description: 字符流写入
 */
package IO;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("FileWriter.txt",true);
        fileWriter.write("\nhello wrold!\r");
        fileWriter.close();
    }


}
