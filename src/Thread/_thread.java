/**
 * FileName: _thread
 * Author:   16681
 * Date:     2019/3/22 8:20
 * Description: 继承java.lang包下的Thread类，覆写Thread类中的方法;
 * 该方法创建了四个新线程，每个线程独立的处理各自的资源，不妥！
 */
package Thread;

class myThread extends Thread {
    int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                Thread thread = Thread.currentThread();
                String th_name = thread.getName();
                System.out.println(th_name + " 正在发售第 " + ticket-- + " 张车票");
            }
        }
    }
}

public class _thread {
    public static void main(String[] args) {
//        myThread mythread = new myThread();
//        mythread.start();
//        mythread.start();
//        mythread.start();
//        mythread.start();             错误的！
        new myThread().start();         //新建四个线程
        new myThread().start();
        new myThread().start();
        new myThread().start();
    }
}
