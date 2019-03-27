/**
 * FileName: Outer_Inner_02
 * Author:   16681
 * Date:     2019/3/21 8:53
 * Descriptioin: 调用内部类方法
 */
package object_oriented_01;

class Father {
    private String name = "张三";

    class Child {
        public void introFather() {
            System.out.println("我叫" + name);
        }
    }
}

public class Outer_Inner_02 {
    public static void main(String[] args) {
        Father.Child child = new Father().new Child();
        child.introFather();
    }
}
