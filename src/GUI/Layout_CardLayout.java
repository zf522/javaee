/**
 * FileName: Layout_CardLayout
 * Author:   16681
 * Date:     2019/3/24 19:53
 * Description: 卡片布局管理器
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//定义一个Cardlayout类
class Cardlayout extends Frame implements ActionListener {
    //定义面板
    Panel cardpanel = new Panel();
    Panel getCardpanel = new Panel();
    //定义按钮
    Button nextbutton, prebutton;
    //定义卡片布局对象
    CardLayout cardLayout = new CardLayout();

    public Cardlayout() {
    /*
    定义构造方法，设置卡片布局管理器的属性
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
        //给cardpanel面板添加布局和标签
        cardpanel.setLayout(cardLayout);
        cardpanel.add(new Label("第一个界面", Label.CENTER));
        cardpanel.add(new Label("第二个界面", Label.CENTER));
        cardpanel.add(new Label("第三个界面", Label.CENTER));
        //给按钮添加监听器，
        nextbutton = new Button("下一个");
        prebutton = new Button("上一个");
        nextbutton.addActionListener(this);
        prebutton.addActionListener(this);
        //将按钮添加到面板上
        getCardpanel.add(nextbutton);
        getCardpanel.add(prebutton);
        //将面板添加到窗口上
        this.add(cardpanel, BorderLayout.CENTER);
        this.add(getCardpanel, BorderLayout.SOUTH);
    }

    //实现按钮的监听触发并处理
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

        Cardlayout cardlayout =new Cardlayout();//实例化
    }
}
