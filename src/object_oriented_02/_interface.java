/**
 * FileName: _interface_implements
 * Author:   16681
 * Date:     2019/3/21 19:28
 * Description: 接口：接口中的方法默认被"public abstract"修饰，全是抽象方法；
 *                    接口中的变量默认被"public static final"修饰，全是全局变量。
 *                    定义一个类，用implements关键字实现接口，可以一次性实现多个接口，用逗号隔开；或者用一个接口extends另一个接口
 */
package object_oriented_02;

interface X{
    String name = "x";
    void breath();
    void run();
}
interface Y extends X{
    void walk();
}
class Fu{
    public Fu(){
        System.out.println("父类构造方法被调用了");
    }
}
class Z extends Fu implements Y{
    public Z(){
        super();
    }

    public void breath(){
        System.out.println("name="+name);
    }
    public void run(){
        System.out.println("调用了接口X中的run()");
    }
    public void walk(){
        System.out.println("调用了接口Y中的walk()");
    }

}

public class _interface {
    public static void main(String[] args){
        Z z= new Z();
        z.breath();
        z.run();
        z.walk();
    }

}
