/**
 * FileName: Layout_BorderLayout
 * Author:   16681
 * Date:     2019/3/24 19:02
 * Description: 边界布局管理器
 */
package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout_BorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("新窗体");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        Button button1 = new Button("east");
        Button button2 = new Button("south");
        Button button3 = new Button("west");
        Button button4 = new Button("north");
        Button button5 = new Button("center");
        frame.add(button1, BorderLayout.EAST);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.WEST);
        frame.add(button4, BorderLayout.NORTH);
        frame.add(button5, BorderLayout.CENTER);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window window = (Window) e.getComponent();
                window.dispose();
            }
        });
    }
}
