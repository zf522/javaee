/**
 * FileName: J_Jframe
 * Author:   16681
 * Date:     2019/3/25 19:24
 * Description:
 */
package GUI;

import javax.swing.*;
import java.awt.*;

public class J_Jframe extends JFrame {
    public J_Jframe() {

        this.setTitle("ÐÂ´°Ìå");
        this.setSize(200, 300);
        this.setLocation(200, 300);
        JButton jButton = new JButton("°´Å¥");
        this.setLayout(new FlowLayout());
        this.add(jButton);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new J_Jframe();
    }
}

