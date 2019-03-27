/**
 * FileName: _Thread_Runnable
 * Author:   16681
 * Date:     2019/3/22 8:34
 * Description: 实现java.lang.Runnable接口:只创建一个对象，创建四个线程，
 * 在每个线程上都调用此对象的run()方法，确保四个线程访问的是同一个ticket变量。
 */
package Thread;

class the_thread implements Runnable {
    int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                Thread thread = Thread.currentThread();//获取当前线程
                String th_name = thread.getName();
                System.out.println(th_name + " 正在发售第 " + ticket-- + " 张车票");
            }
        }
    }
}

public class _Thread_Runnable {
    public static void main(String[] args) {
        the_thread the_thread = new the_thread();
        new Thread(the_thread, "窗口1：").start(); //构造方法Thread(Runnable target,String name)在创建线程对象的同时指定线程的名称
        new Thread(the_thread, "窗口2：").start();
        new Thread(the_thread, "窗口3：").start();
        new Thread(the_thread, "窗口4：").start();
    }
}
