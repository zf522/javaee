/**
 * FileName: event_key
 * Author:   16681
 * Date:     2019/3/24 16:45
 * Description: 键盘事件
 */
package GUI;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class event_key {
    public static void main(String[] args) {
        Frame frame = new Frame("新窗体");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);
        frame.setLocation(300, 200);
        frame.setVisible(true);
        TextField textField = new TextField(30);
        frame.add(textField);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e) {
                Window window = (Window) e.getComponent();
                window.dispose();
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                String s = KeyEvent.getKeyText(keycode);
                System.out.print("输入的内容是：" + s + ", ");
                System.out.println("对应的keycode为：" + keycode);
            }
        });
    }
}
