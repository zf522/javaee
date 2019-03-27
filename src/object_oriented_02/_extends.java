/**
 * FileName: _extends
 * Author:   16681
 * Date:     2019/3/21 9:04
 * Descriptioin: 类的继承
 */
package object_oriented_02;
class Animal{
     String name;
    public void shout(){
        System.out.println("wang……wang……");
    }
}
class Dog extends Animal{
    public void show(){
        System.out.println("我是"+name);
    }
}

public class _extends {
    public static void main(String[] args ){
        Dog dog = new Dog();
        dog.name = "haha";
        dog.show();
        dog.shout();
    }

}
