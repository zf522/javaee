/**
 * FileName: _throws
 * Author:   16681
 * Date:     2019/3/21 20:50
 * Description: 抛出异常：try……catch; throws关键字
 */
package object_oriented_02;

public class _throws {
    public static void main(String[] args){
        try{
            int result = divide(4,0);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("进入finally模块");
        }
    }
    public static int divide(int x,int y) throws Exception{
        return x/y;
    }
}
