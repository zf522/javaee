/**
 * FileName: back_thread_Runnable
 * Author:   16681
 * Date:     2019/3/22 8:56
 * Description: 后台线程:某个线程对象在启动之前调用了setDeamon(true)语句，这个线程就变成一个后台进程。
 *              进程中只有后台线程运行时，进程就会结束。
 *
 */
package Thread;

class back_thread implements Runnable {
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName()+"-----is running.");
        }

    }
}

public class back_thread_Runnable {
    public static void main(String[] args) {
        System.out.println("main线程是后台线程吗？ "+Thread.currentThread().isDaemon());
        back_thread th = new back_thread();//创建back_thread对象
        Thread t= new Thread(th,"后台线程");//创建线程t，共享th的资源
        System.out.println("th线程默认是后台线程吗？ "+t.isDaemon());//判断是否为后台线程
        t.setDaemon(true);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

    }
}
