/**
 * FileName: ex04
 * Author:   16681
 * Date:     2019/3/22 16:08
 * Description: System类中getProperties()方法
 */
package Java_API;

import java.util.Enumeration;
import java.util.Properties;

public class ex04 {
    public static void main(String[] args) {
        //获取当前系统属性
        Properties properties = System.getProperties();
        //获得 所有系统属性 的key，返回Enumeration对象
        Enumeration propertyNames = properties.propertyNames();
        while(propertyNames.hasMoreElements()){
            //获取系统属性的key
            String key = (String )propertyNames.nextElement();
            //获取当前key对应的value
            String value = System.getProperty(key);
            System.out.println(key+"--->"+value);
        }
    }


}
