/**
 * FileName: Hero
 * Author:   16681
 * Date:     2019/3/24 9:50
 * Description: 英雄
 */
package IO;

public class Hero {
    String name;

    int attack;

    String type;
    public Hero(){

    }

    public Hero(String name, int attack, String type) {
        this.name = name;
        this.attack = attack;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
