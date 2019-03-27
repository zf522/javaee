/**
 * FileName: Outer_static_inner
 * Author:   16681
 * Date:     2019/3/20 21:36
 * Descriptioin: 调用静态内部类
 */
package object_oriented_01;

class outer {
    private static int number = 4;

    static class Inner {
        void show() {
            System.out.println("我是内部类");
            System.out.println("num:" + number);
        }
    }
}

public class Outer_static_inner {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println("");
        outer.Inner inner = new outer.Inner();        //调用静态内部类
        inner.show();
    }
}
