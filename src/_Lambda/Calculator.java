/**
 * FileName: Calculator
 * Author:   16681
 * Date:     2019/3/24 14:49
 * Description: 函数式接口：有且仅有一个抽象方法的接口
 *              Java中使用Lambda的前提是：必须有函数式接口。
 */
package _Lambda;

@FunctionalInterface
//检测当前接口是不是函数式接口
interface Calculator {
    int sum(int a, int b);

}
