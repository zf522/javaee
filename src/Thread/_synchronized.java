/**
 * FileName: _synchronized
 * Author:   16681
 * Date:     2019/3/22 10:33
 * Description: 同步代码块：使用synchronized修饰的代码块，需要创建一个锁对象；
 * 同步方法：使用synchronized修饰的方法：synchronized void ticket(){},在某一时刻只允许一个线程访问。
 */
package Thread;

class Ticket implements Runnable {
    private int ticket = 10;
    Object lock = new Object();//定义一个任意类型的对象，用作同步代码块的锁

    public void run() {
        while (true) {
            synchronized (lock) {   //定义同步代码块
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-----卖出的票" + ticket--);
                } else {
                    break;
                }
            }
        }
    }
}

public class _synchronized {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "线程一").start();
        new Thread(ticket, "线程二").start();
        new Thread(ticket, "线程三").start();
        new Thread(ticket, "线程四").start();
    }
}
