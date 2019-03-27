/**
 * FileName: _Enumeration
 * Author:   16681
 * Date:     2019/3/22 21:29
 * Description: 接口: 通过Enumeration对象可以遍历Vector集合中的元素
 */
package collection_class;


import java.util.*;

public class _Enumeration {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        Enumeration enumeration =vector.elements();
        while (enumeration.hasMoreElements()){
            Object object = enumeration.nextElement();
            System.out.println(object);
        }
    }


}
