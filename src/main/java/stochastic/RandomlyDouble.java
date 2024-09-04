package stochastic;

public class RandomlyDouble {//生成随机浮点数
    //浮点数生成方法
    public static double getRandomDouble(double min, double max) {
        return Math.random() * (max - min) + min;
    }
}
