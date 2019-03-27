/**
 * FileName: _thread_communication
 * Author:   16681
 * Date:     2019/3/22 14:31
 * Description: 进程通信
 */
package Thread;

class Storage {
    private int[] cells = new int[10];
    private int inPos, outPos;
    private int count;

    public synchronized void put(int num) {
        try {
            if (count == cells.length) {
                this.wait();        //让此线程等待
            }
            cells[inPos] = num;
            System.out.println("在cell[" + inPos + "]中放入数据---" + cells[inPos]);
            inPos++;    //存完元素，让位置加1
            if (inPos == cells.length)     //当在cell[9]存完数据后，再从cell[0]开始
                inPos = 0;
            count++;        //每放一个数据count加1
            this.notify();  //唤醒线程
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        try {
            while (count == 0) {
                this.wait();
            }
            int data = cells[outPos];
            System.out.println("从cell[" + outPos + "]中取出数据---" + data);
            cells[outPos] = 0;
            outPos++;
            if (outPos == cells.length)
                outPos = 0;
            count--;
            this.notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Input implements Runnable {
    private Storage storage;
    private int num;

    Input(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            storage.put(num++);
        }
    }
}

class Output implements Runnable {
    private Storage storage;

    Output(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            storage.get();
        }
    }
}

public class _thread_communication {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Input input = new Input(storage);
        Output output = new Output(storage);
        new Thread(input).start();
        new Thread(output).start();
    }
}
