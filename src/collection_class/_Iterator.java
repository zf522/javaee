/**
 * FileName: _Iterator
 * Author:   16681
 * Date:     2019/3/22 21:04
 * Description: 迭代器：主要用于迭代访问Collectio中的元素
 */
package collection_class;

import java.util.ArrayList;
import java.util.Iterator;

public class _Iterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        Iterator it =arrayList.iterator();      //获取Iterator对象
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }



}
