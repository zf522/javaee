/**
 * FileName: Outer_Inner
 * Author:   16681
 * Date:     2019/3/20 21:22
 * Descriptioin: 外部类调用内部类方法
 */
package object_oriented_01;

class Outer {
    private int number = 4;

    public void test() {
        Inner inner = new Inner();
        inner.show();
    }

    class Inner {
        public void show() {
            System.out.println("我是内部类");
            System.out.println("num:" + number);
        }
    }
}

public class Outer_Inner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println("");
        Outer.Inner inner = new Outer().new Inner();        //调用内部类
        inner.show();
    }
}
