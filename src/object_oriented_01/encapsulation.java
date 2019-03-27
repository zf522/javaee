/**
 * FileName: encapsulation
 * Author:   16681
 * Date:     2019/3/20 20:11
 * Descriptioin: 类的封装与this：访问类的成员变量；调用成员方法
 */
package object_oriented_01;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("年龄输入有误！");
        } else {
            this.age = age;
        }
    }

    public void introduce() {
        System.out.println("我叫" + this.name + ",我今年" + this.age + "岁了！");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("臧三");
        p.setAge(10);
        p.introduce();
    }
}
