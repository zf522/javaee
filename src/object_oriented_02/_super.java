/**
 * FileName: _super
 * Author:   16681
 * Date:     2019/3/21 9:25
 * Description: 使用super关键字调用 父类 的成员变量，成员方法，构造方法
 * super是在父子类中，this是在同一个类中
 */
package object_oriented_02;

class Person {
    String name = "Person父类";

    public Person() {
        System.out.println("调用了父类无惨构造方法");
    }

    public Person(String name) {
        System.out.println(name);
    }

    void show() {
        System.out.println("调用父类show方法");
    }
}

class Student extends Person {
    public Student() {
        super("调用父类有参的构造方法");
    }

    void show() {
        super.show();   //调用父类show方法
        System.out.println("name=" + super.name); //调用父类成员变量
    }
}

public class _super {
    public static void main(String[] args) {
        Person person = new Person("张三");
        Student student = new Student();    //默认调用Student无参的构造方法
        student.show();
    }
}
