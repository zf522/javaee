/**
 * FileName: _treeMap_01
 * Author:   16681
 * Date:     2019/3/23 10:11
 * Description: 自定义比较器MyComparator实现排序
 */
package collection_class;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
/*

 */
class  MyComporator implements Comparator{
    public int compare(Object ob1,Object ob2){
        String s1 = (String) ob1;
        String s2 = (String ) ob2;
        return s2.compareTo(s1);
    }
}

public class _treeMap_01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new MyComporator());
        treeMap.put("2","zhangsan");
        treeMap.put("1","z");
        treeMap.put("3","zh");
        Set keyset = treeMap.keySet();
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Object value = treeMap.get(key);
            System.out.println(key+": "+value);
        }

    }
}
