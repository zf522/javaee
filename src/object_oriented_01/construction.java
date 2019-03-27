/**
 * FileName: construction
 * Author:   16681
 * Date:     2019/3/20 20:45
 * Descriptioin: 构造方法与this：在一个构造方法中调用另一个构造方法，this必须写在首行
 */
package object_oriented_01;

class Student {
    public Student() {
        System.out.println("无参的构造方法被调用了");
    }

    public Student(String name) {
        this();     //调用另外一个构造方法
        System.out.println("我叫" + name);
    }
}

public class construction {
    public static void main(String[] args) {
        Student student0 = new Student();
        Student student = new Student("小明");
    }
}
