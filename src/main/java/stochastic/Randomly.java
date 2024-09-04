package stochastic;

public class Randomly {//随机数据生成器

    //整数生成方法
    public static int getRandomInt(int min, int max) {//生成一个[min,max]之间的随机整数
        return (int) (Math.random() * (max - min + 1) + min);
    }

    //浮点数生成方法
    public static double getRandomDouble(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    //随机字符串
    public static String getRandomString(int length, /*长度*/
                                         int start /*起始位置*/,
                                         int end /*结束位置*/) {//利用ASCII码表生成随机字符串
        char ch;//随机字符
        StringBuilder str = new StringBuilder();//随机字符串
        for (int i = 0; i < length; i++){
            ch = (char) (Math.random() * start + end);//从ASCII码表获取英文字符的值并转换为字符串
            str.append(ch);//拼接字符串
        }
        return str.toString();
    }

    //随机英文字符串
    public static String getRandomEnglishString(int length) {
        return getRandomString(length, 65, 90);
    }

    //随机中文字符串
    public static String getRandomChineseString(int length) {
        return getRandomString(length, 19968, 40869);
    }

}
