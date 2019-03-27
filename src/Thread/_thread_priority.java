/**
 * FileName: _thread_priority
 * Author:   16681
 * Date:     2019/3/22 9:35
 * Description: 线程的优先级:优先级高的程序先执行的几率大，而优先级低的程序可能会后执行。
 *              线程休眠：Thread.sleep(500)：该线程休眠500毫秒
 *              线程让步：Thread.yield()
 *              线程插队：Thread.join()
 */
package Thread;

class min_priority implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
        }
    }
}

class max_priority implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
        }
    }
}

public class _thread_priority {
    public static void main(String[] args) {
        Thread min = new Thread(new min_priority(), "优先级较低的进程");
        Thread max = new Thread(new max_priority(), "优先级较高的进程");
        min.setPriority(Thread.MIN_PRIORITY);//设置线程的优先级
        max.setPriority(Thread.MAX_PRIORITY);
//        min.start();
        max.start();
        min.start();
    }
}
