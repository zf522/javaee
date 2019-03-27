/**
 * FileName: Layout_GirdLayout
 * Author:   16681
 * Date:     2019/3/24 19:14
 * Description: 网格布局管理器
 */
package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout_GirdLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("新窗体");
        frame.setLayout(new GridLayout(3, 10, 3, 5));
        frame.setSize(500, 500);
        frame.setLocation(200, 300);
        frame.setVisible(true);
        Button button1 = new Button("east");
        Button button2 = new Button("south");
        Button button3 = new Button("west");
        Button button4 = new Button("north");
        Button button5 = new Button("center");
        Button button6 = new Button("Last");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window window = (Window) e.getComponent();
                window.dispose();
            }
        });
    }
}
