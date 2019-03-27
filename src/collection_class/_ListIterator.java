/**
 * FileName: _ListIterator
 * Author:   16681
 * Date:     2019/3/22 21:22
 * Description: 迭代器：是Iterator的子类，主要是反向遍历
 */
package collection_class;

import java.util.ArrayList;
import java.util.ListIterator;

public class _ListIterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            for (Object object : arrayList) {
                System.out.println(object);
            }
            Object object = listIterator.previous();
            System.out.println(object + "  ");
        }
    }
}
