/**
 * FileName: _FileOutPutStream
 * Author:   16681
 * Date:     2019/3/23 15:28
 * Description: 是操作文件的字节输出流
 */
package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class _FileOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FileOutPutStream.txt",true);
        String string = "欢迎你!";
        byte[] bytes = string.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            fileOutputStream.write(bytes[i]);
        }
        fileOutputStream.close();
    }
}
