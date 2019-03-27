/**
 * FileName: _Set
 * Author:   16681
 * Date:     2019/3/22 21:41
 * Description: Set接口中的元素无序，并且都会以某种规则保证存入的元素不出现重复
 */
package collection_class;

import java.util.HashSet;
import java.util.Iterator;

public class _Set_HashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("d");
        hashSet.add("e");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }


    }
}

