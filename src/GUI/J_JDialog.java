/**
 * FileName: J_JDialog
 * Author:   16681
 * Date:     2019/3/26 9:58
 * Description: ģ̬�Ի���ͷ�ģ̬�Ի���
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J_JDialog {
    public static void main(String[] args) {
        //����������ť�ʹ���
        JButton jButton1 = new JButton("ģ̬�Ի���");
        JButton jButton2 = new JButton("��ģ̬�Ի���");
        JFrame jFrame = new JFrame("DialogDemo");
        jFrame.setSize(600, 600);
        jFrame.setLocation(300, 200);
        jFrame.setLayout(new FlowLayout());
        //��Container��������Ӱ�ť
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        //���õ���رհ�ťĬ�Ϲرմ���
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        //����һ��JDialog�Ի���
        JLabel jLabel = new JLabel();
        JDialog jDialog = new JDialog(jFrame, "Dialog");
        jDialog.setSize(450, 350);
        jDialog.setLocation(450, 350);
        jDialog.setLayout(new FlowLayout());
        JButton jButton = new JButton("ȷ��");
        jDialog.add(jButton);
        //Ϊģ̬�Ի���ť��ӵ���¼�
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //���öԻ���ģ̬
                jDialog.setModal(true);
                //���JDialog������û�����JLabel��ǩ���Ͱ�JLabel��ǩ����
                if (jDialog.getComponents().length == 1) {
                    jDialog.add(jLabel);
                }
                jLabel.setText("ģ̬�Ի��򣬵��ȷ����ť�ر�");
                jDialog.setVisible(true);
            }
        });
        //Ϊ��ģ̬�Ի���ť��ӵ���¼�
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //���öԻ���ģ̬
                jDialog.setModal(true);
                //���JDialog������û�����JLabel��ǩ���Ͱ�JLabel��ǩ����
                if (jDialog.getComponents().length == 1) {
                    jDialog.add(jLabel);
                }
                jLabel.setText("��ģ̬�Ի��򣬵��ȷ����ť�ر�");
                jDialog.setVisible(true);
            }
        });
        //Ϊ�Ի����еİ�ť��ӵ���¼�
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jDialog.dispose();
            }
        });
    }
}
