/**
 * FileName: _ArrayList
 * Author:   16681
 * Date:     2019/3/22 20:20
 * Description: ArrayList集合
 */
package collection_class;

import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("1  ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
