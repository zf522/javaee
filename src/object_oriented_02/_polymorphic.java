/**
 * FileName: _polymorphic
 * Author:   16681
 * Date:     2019/3/21 20:01
 * Description: 多态：1.允许使用一个父类类型的变量来引用一个子类类型的对象：Animal cat = new Cat();
 * 2.通过强制转换（将父类变量转换成子类对象），可以调用子类中的某些方法：Cat cat = (Cat) animal;
 */
package object_oriented_02;

interface Animals {
    void shout();
}

class Cat implements Animals {
    public void shout() {
        System.out.println("miao……");
    }
    void sleep(){
        System.out.println("子类的方法");
    }
}

public class _polymorphic {
    public static void main(String[] args) {
//        Animals cat = new Cat();
//        fun(cat);
        Cat cat = new Cat();
        fun(cat);
    }

//     public static void fun(Animals animals) {
//        animals.shout();
//    }
    public static void fun(Animals animals){
        Cat cat = (Cat) animals;    //强制转换成子类类型
        cat.shout();
        cat.sleep();    //调用子类中的方法
    }
}
