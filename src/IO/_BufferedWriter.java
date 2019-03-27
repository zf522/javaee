/**
 * FileName: BufferWriter
 * Author:   16681
 * Date:     2019/3/23 16:31
 * Description: 带缓冲区的包装流
 */
package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _BufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("BufferedWriter.txt");
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

        bufferWriter.write("BufferedWriter");
        bufferWriter.newLine();
        bufferWriter.write("BufferedWriter");
        bufferWriter.close();

    }
}
