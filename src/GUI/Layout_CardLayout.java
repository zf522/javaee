/**
 * FileName: Layout_CardLayout
 * Author:   16681
 * Date:     2019/3/24 19:53
 * Description: ��Ƭ���ֹ�����
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//����һ��Cardlayout��
class Cardlayout extends Frame implements ActionListener {
    //�������
    Panel cardpanel = new Panel();
    Panel getCardpanel = new Panel();
    //���尴ť
    Button nextbutton, prebutton;
    //���忨Ƭ���ֶ���
    CardLayout cardLayout = new CardLayout();

    public Cardlayout() {
    /*
    ���幹�췽�������ÿ�Ƭ���ֹ�����������
    */
        this.setLocation(200, 300);
        this.setSize(500, 500);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                Cardlayout.this.dispose();
            }
        });
        //��cardpanel�����Ӳ��ֺͱ�ǩ
        cardpanel.setLayout(cardLayout);
        cardpanel.add(new Label("��һ������", Label.CENTER));
        cardpanel.add(new Label("�ڶ�������", Label.CENTER));
        cardpanel.add(new Label("����������", Label.CENTER));
        //����ť��Ӽ�������
        nextbutton = new Button("��һ��");
        prebutton = new Button("��һ��");
        nextbutton.addActionListener(this);
        prebutton.addActionListener(this);
        //����ť��ӵ������
        getCardpanel.add(nextbutton);
        getCardpanel.add(prebutton);
        //�������ӵ�������
        this.add(cardpanel, BorderLayout.CENTER);
        this.add(getCardpanel, BorderLayout.SOUTH);
    }

    //ʵ�ְ�ť�ļ�������������
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nextbutton) {
            cardLayout.next(cardpanel);
        }
        if (e.getSource() == prebutton) {
            cardLayout.previous(cardpanel);
        }
    }
}

public class Layout_CardLayout {
    public static void main(String[] args) {

        Cardlayout cardlayout =new Cardlayout();//ʵ����
    }
}
