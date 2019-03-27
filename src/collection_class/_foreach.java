/**
 * FileName: _foreach
 * Author:   16681
 * Date:     2019/3/22 21:12
 * Description: foreach循环：增强for循环，用于遍历数组或集合中的元素,不能对其中的元素进行修改。
 */
package collection_class;

import java.util.ArrayList;

public class _foreach {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        for (Object object : arrayList) {
            System.out.println(object);
        }
    }
}
