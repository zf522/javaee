/**
 * FileName: _Graphics
 * Author:   16681
 * Date:     2019/3/24 21:26
 * Description: 画笔制作验证码
 */
package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

class MyPanel extends Panel {

    public void paint(Graphics g) {

        int width = 160;
        int heigth = 40;
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, width, heigth);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width, heigth);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(heigth);
            g.drawOval(x, y, 2, 2);
        }
        g.setFont(new Font("黑体", Font.BOLD, 30));
        g.setColor(Color.BLUE);
        char[] chars = ("0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM").toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int pos = random.nextInt(chars.length);
            char c = chars[pos];
            stringBuilder.append(c + " ");
        }
        g.drawString(stringBuilder.toString(), 20, 30);
    }
}

public class _Graphics {
    public static void main(String[] args) {

        Frame frame = new Frame("验证码");
        Panel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null);
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


