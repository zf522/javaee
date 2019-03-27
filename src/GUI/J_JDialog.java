/**
 * FileName: J_JDialog
 * Author:   16681
 * Date:     2019/3/26 9:58
 * Description: 模态对话框和非模态对话框
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J_JDialog {
    public static void main(String[] args) {
        //建立两个按钮和窗口
        JButton jButton1 = new JButton("模态对话框");
        JButton jButton2 = new JButton("非模态对话框");
        JFrame jFrame = new JFrame("DialogDemo");
        jFrame.setSize(600, 600);
        jFrame.setLocation(300, 200);
        jFrame.setLayout(new FlowLayout());
        //在Container对象上添加按钮
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        //设置点击关闭按钮默认关闭窗口
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        //定义一个JDialog对话框
        JLabel jLabel = new JLabel();
        JDialog jDialog = new JDialog(jFrame, "Dialog");
        jDialog.setSize(450, 350);
        jDialog.setLocation(450, 350);
        jDialog.setLayout(new FlowLayout());
        JButton jButton = new JButton("确定");
        jDialog.add(jButton);
        //为模态对话框按钮添加点击事件
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置对话框模态
                jDialog.setModal(true);
                //如果JDialog窗体上没有添加JLabel标签，就把JLabel标签加上
                if (jDialog.getComponents().length == 1) {
                    jDialog.add(jLabel);
                }
                jLabel.setText("模态对话框，点击确定按钮关闭");
                jDialog.setVisible(true);
            }
        });
        //为非模态对话框按钮添加点击事件
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置对话框模态
                jDialog.setModal(true);
                //如果JDialog窗体上没有添加JLabel标签，就把JLabel标签加上
                if (jDialog.getComponents().length == 1) {
                    jDialog.add(jLabel);
                }
                jLabel.setText("非模态对话框，点击确定按钮关闭");
                jDialog.setVisible(true);
            }
        });
        //为对话框中的按钮添加点击事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jDialog.dispose();
            }
        });
    }
}
