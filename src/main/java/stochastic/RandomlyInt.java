package stochastic;

public class RandomlyInt {//生成随机整数

    //整数生成方法
    public static int getRandomInt(int min, int max) {//生成一个[min,max]之间的随机整数
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
