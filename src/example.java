/**
 * FileName: example
 * Author:   16681
 * Date:     2019/3/20 18:59
 * Descriptioin: 小例子
 */
//public class example {
//    public static void main(String[] args) {
//        System.out.print(-5%3);
//
//    }
//}
//package bookexample;
class person {
    String name;

    public void introduce() {
        System.out.println("我叫" + name);
    }
}

public class example {
    public static void main(String[] args) {
        person p = new person();
        p.name = "张三";
        p.introduce();
    }
}
