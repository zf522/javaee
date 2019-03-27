/**
 * FileName: window_MouseClicked
 * Author:   16681
 * Date:     2019/3/24 16:23
 * Description: 用匿名内部类实现事件处理
 */
package GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class window_MouseClicked {
    public static void main(String[] args) {
        Frame frame= new Frame("新窗体");
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.setVisible(true);
        Button button = new Button("EXIT");
        frame.add(button);
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
