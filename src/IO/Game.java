/**
 * FileName: Game
 * Author:   16681
 * Date:     2019/3/24 9:49
 * Description: 五人游戏
 */
package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        ArrayList<Hero> list = new ArrayList<>();
        //加载
        System.out.println("加载文件到集合中");
        loadfile(list);
        System.out.println("判断集合中有数据吗");
        boolean isNew = list.isEmpty();
        System.out.println("是不是新的队伍" + isNew);
        //true:创建五个对象，添加到集合中
        if (isNew) {
            System.out.println("添加五个人到集合中");
            addfivehero(list);
        }
        //输出集合
        System.out.println("输出五个对象");
        showhero(list);
        //计算总攻击值
        System.out.println("战队的总攻击力是： " + total_attack(list));
        //判断是不是新集合，如果是，保存文件
        if (isNew) {
            System.out.println("保存文件");
            savefile(list);
        }
        System.out.println("退出游戏");
    }

    public static void loadfile(ArrayList<Hero> list) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hero.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] string = line.split(",");
            String name = string[0];
            int attack = Integer.parseInt(string[1]);
            String type = string[2];
            Hero hero = new Hero(name, attack, type);
            list.add(hero);
        }
        bufferedReader.close();
    }

    public static void savefile(ArrayList<Hero> list) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hero.txt"));
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            String string = hero.name + "," + hero.getAttack() + "," + hero.getType();
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static int total_attack(ArrayList<Hero> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            int attack = hero.getAttack();
            total += attack;
        }
        return total;
    }

    public static void showhero(ArrayList<Hero> list) {
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            System.out.println(hero.getName() + "," + hero.getAttack() + "," + hero.getType());
        }
    }

    public static void addfivehero(ArrayList<Hero> list) {
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第" + i + "位英雄名称：");
            String name = scanner.next();
            System.out.println("请输入第" + i + "位英雄攻击力：");
            int attack = scanner.nextInt();
            System.out.println("请输入第" + i + "位英雄类型：");
            String type = scanner.next();
//            list.add(name + "," + attack + "," + type);
            Hero hero = new Hero(name, attack, type);//创建一个英雄对象
            list.add(hero);
        }
    }
}
