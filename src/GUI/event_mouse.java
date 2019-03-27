/**
 * FileName: event_mouse
 * Author:   16681
 * Date:     2019/3/24 16:37
 * Description: 鼠标事件
 */
package GUI;

import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class event_mouse {
    public static void main(String[] args) {
        Frame frame= new Frame("新窗体");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.setVisible(true);

        Button button = new Button("EXIT");
        frame.add(button);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

    }
}
