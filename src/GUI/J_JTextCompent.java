/**
 * FileName: J_JTextCompent
 * Author:   16681
 * Date:     2019/3/26 10:53
 * Description: �ı����
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
        jButton = new JButton("����");
        jTextField = new JTextField(20);
        //Ϊ��ť����¼�
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String content = jTextField.getText();
                if (content != null && !content.trim().equals("")) {//ocntent.trim().equals("")�ж�ȥ���ո���Ƿ��equal�����е��ַ������
                    jTextArea.append("���ˣ� " + content + "\n");
                } else {
                    jTextArea.append("������Ϣ����Ϊ��\n");
                }
                jTextField.setText("");
            }
        });
        //���JPanel������
        Label label = new Label("������Ϣ");
        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        //����������JPanel�����ӵ�JFrame����
//        JFrame jFrame =new JFrame("���촰��");
//        jFrame.add(jScrollPane);
//        jFrame.add(jPanel);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.SOUTH);
        this.setSize(400, 300);
        this.setTitle("���촰��");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

public class J_JTextCompent {
    public static void main(String[] args) {

        new Jchat();
    }
}
