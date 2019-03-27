/**
 * FileName: window_dispose
 * Author:   16681
 * Date:     2019/3/24 16:00
 * Description: 继承适配器类来实现监听器接口，关闭窗口
 */
package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window_dispose {
    public static void main(String[] args) {
        Frame frame= new Frame("新窗体");
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.setVisible(true);
        //注册监听器
        frame.addWindowListener(new MyWindowLinster());

    }
    //继承WindowAdapter类，重写windowClosing方法
    static class MyWindowLinster extends WindowAdapter{
        public void windowClosing (WindowEvent e){
            Window window  =(Window)e.getComponent();
            window.dispose();
        }
    }
}
