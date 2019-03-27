/**
 * FileName: J_JCheckBox
 * Author:   16681
 * Date:     2019/3/27 14:41
 * Description: 复选框
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J_JCheckBox extends JFrame {
    private JCheckBox italic;
    private JCheckBox bold;
    private JLabel jLabel;

    public J_JCheckBox() {

        jLabel = new JLabel("合师欢迎你！", JLabel.CENTER);
        jLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        this.add(jLabel);
        italic = new JCheckBox("ITALIC");
        bold = new JCheckBox("BOLD");
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int mode = 0;
                if (italic.isSelected()) {
                    mode += Font.ITALIC;
                }
                if (bold.isSelected()) {
                    mode += Font.BOLD;
                }
                jLabel.setFont(new Font("宋体", mode, 20));
            }
        };
        //为两个复选框添加监听器
        italic.addActionListener(actionListener);
        bold.addActionListener(actionListener);
        //进行面板操作
        JPanel jPanel = new JPanel();
        jPanel.add(italic);
        jPanel.add(bold);
        this.add(jPanel, BorderLayout.SOUTH);
        this.setSize(500, 500);
        this.setVisible(true);
        this.getDefaultCloseOperation();
    }

    public static void main(String[] args) {

        new J_JCheckBox();
    }
}
