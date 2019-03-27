/**
 * FileName: Test
 * Author:   16681
 * Date:     2019/3/21 21:38
 * Description: 自定义异常题目:当index>10时，抛出自定义异常
 */
package object_oriented_02;

class NoThisSongException extends Exception {
    public NoThisSongException() {
    }

    public NoThisSongException(String message) {
        super(message);
    }
}

class Player {
    public int play(int index) throws NoThisSongException {
        if (index > 10) {
            throw new NoThisSongException("您播放的歌曲不存在");
        }
        return index;
    }
}

public class Test {
    public static void main(String[] args) {
        Player player = new Player();

        try {
            player.play(11);
        } catch (NoThisSongException e) {
            System.out.println(e.getMessage());
        }
    }
}
