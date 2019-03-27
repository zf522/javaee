/**
 * FileName: _Properties
 * Author:   16681
 * Date:     2019/3/23 14:26
 * Description: 线程安全的，主要用来存储字符串类型的键和值：getProperty, setProperty, propertyNames
 */
package collection_class;

import java.util.Enumeration;
import java.util.Properties;

public class _Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("background","black");
        properties.setProperty("bgm","trouble");
        properties.setProperty("font","Sima");
        Enumeration name = properties.propertyNames();
        while (name.hasMoreElements()){
            String key = (String)name.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+", "+value);
        }

    }


}
