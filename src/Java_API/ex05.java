/**
 * FileName: ex05
 * Author:   16681
 * Date:     2019/3/22 16:30
 * Description: Runtime类
 */
package Java_API;

public class ex05 {
    public static void main(String[] args) {
        Runtime rt  = Runtime.getRuntime();
        System.out.println("处理器的个数："+rt.availableProcessors()+"个");
        System.out.println("空闲内存数量："+rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存数量："+rt.maxMemory()/1024/1024+"M");
    }
}
