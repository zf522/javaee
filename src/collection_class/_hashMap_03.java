/**
 * FileName: _hashMap_03
 * Author:   16681
 * Date:     2019/3/23 9:35
 * Description: 对hashmap的遍历方法3
 */
package collection_class;

import java.util.*;

public class _hashMap_03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","zhangsan");
        map.put("2","lisi");
        map.put("3","wangwu");
        Collection values = map.values();
        Iterator iterator  =values.iterator();
        while (iterator.hasNext()){
           Object object = iterator.next();
            System.out.println(object);
        }



    }
}
