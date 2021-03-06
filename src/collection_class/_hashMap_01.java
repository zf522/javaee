/**
 * FileName: _hashMap_01
 * Author:   16681
 * Date:     2019/3/23 9:35
 * Description: 对hashmap的遍历方法1
 */
package collection_class;

import java.util.*;

public class _hashMap_01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","zhangsan");
        map.put("2","lisi");
        map.put("3","wangwu");
        Set keyset =map.keySet();   //获取key的集合
        Iterator iterator  =keyset.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);    //获取每个键对应的值
            System.out.println(key+": "+value);
        }



    }
}
