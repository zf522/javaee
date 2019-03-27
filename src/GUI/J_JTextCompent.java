/**
 * FileName: J_JTextCompent
 * Author:   16681
 * Date:     2019/3/26 10:53
 * Description: 文本组件
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Jchat extends JFrame {
    JButton jButton;
    JTextArea jTextArea;
    JTextField jTextField;

    public Jchat() {

        this.setLayout(new BorderLayout());
        jTextArea = new JTextArea(12, 34);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
//        JPanel jPanel = new JPanel();
        jButton = new JButton("发送");
        jTextField = new JTextField(20);
        //为按钮添加事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String content = jTextField.getText();
                if (content != null && !content.trim().equals("")) {//ocntent.trim().equals("")判断去掉空格后是否和equal括号中的字符串相等
                    jTextArea.append("本人： " + content + "\n");
                } else {
                    jTextArea.append("聊天信息不能为空\n");
                }
                jTextField.setText("");
            }
        });
        //设计JPanel面板组件
        Label label = new Label("聊天信息");
        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        //将滚动面板和JPanel面板添加到JFrame窗口
//        JFrame jFrame =new JFrame("聊天窗口");
//        jFrame.add(jScrollPane);
//        jFrame.add(jPanel);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.SOUTH);
        this.setSize(400, 300);
        this.setTitle("聊天窗口");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

public class J_JTextCompent {
    public static void main(String[] args) {

        new Jchat();
    }
}
