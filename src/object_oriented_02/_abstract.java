/**
 * FileName: _abstract
 * Author:   16681
 * Date:     2019/3/21 19:22
 * Description: 抽象类：只有通过子类实现抽象类中的抽象方法，抽象方法才能得以实现
 */
package object_oriented_02;

abstract class A {
    abstract void show();   //抽象方法没有花括号
}

class B extends A {
    void show() {
        System.out.println("父类的抽象方法被实现了！");
    }
}

public class _abstract {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
