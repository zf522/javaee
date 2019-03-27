/**
 * FileName: _hashMap_02
 * Author:   16681
 * Date:     2019/3/23 9:35
 * Description: 对hashmap的遍历方法2
 */
package collection_class;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _hashMap_02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","zhangsan");
        map.put("2","lisi");
        map.put("3","wangwu");
        Set entryset = map.entrySet();  //获得存储在Map中所有映射的Set集合
        Iterator iterator  =entryset.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) (iterator.next());    //每个Map.Entry对象代表Map中的一个键值对
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+": "+value);
        }



    }
}
