/**
 * FileName: Layout_FlowLayout
 * Author:   16681
 * Date:     2019/3/24 17:10
 * Description: 流式布局管理器
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout_FlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("流式布局");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        frame.setSize(400, 300);
        frame.setLocation(300, 200);
        Button button = new Button("第1个按钮");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            private int num = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(new Button("第" + ++num + "个按钮"));
                frame.setVisible(true);
            }
        });
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window window = (Window) e.getComponent();
                window.dispose();
            }
        });
    }
}
