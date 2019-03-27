/**
 * FileName: _throw
 * Author:   16681
 * Date:     2019/3/21 20:58
 * Description: throw:自定义异常
 */
package object_oriented_02;
//自定义DivideException异常,继承Exception
class DivideException extends Exception {
    public DivideException() {
        super();
    }

    public DivideException(String message) {
        super(message);
    }
}

public class _throw {
    public static void main(String[] args) {
        try {
            int result = divide(4, -1);
            System.out.println(result);
        } catch (DivideException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int x, int y) throws DivideException {
        if (y < 0) {
            throw new DivideException("被除数是负数！");
        }
        return x / y;
    }
}
