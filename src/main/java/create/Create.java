package create;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Create {//超级工厂
    String className;//存储类名
    Class<?> clazz;//存储类对象
    Map<String, Constructor<?>> map = new HashMap<>();//初始化Map集合用于存放构造方法


    static{
        System.out.println("这是一个通过反射批量创建对象的超级工厂！");
    }

    public void getClassObject() {//获取类名，并获取类对象
        System.out.println("请输入你类的地址：");
        try (Scanner scanner = new Scanner(System.in)){
            className = scanner.next();
            try {
                clazz = Class.forName(className);//获取类对象
                System.out.println("获取到了类对象！");
            } catch (ClassNotFoundException e) {
                System.out.println("未找到该类！");
            }
        }catch (Exception e){
            System.out.println("输入类名有误！");
        }
    }

    public void createObject() {//获取构造器，并创建对象
        //获取类的构造器列表
        System.out.println("获取类的构造器列表...");
        try {//获取类的构造器列表,导入Map集合
            for (int i = 0; i < clazz.getConstructors().length; i++/*遍历取出构造器放入Map中*/){
                map.put(clazz.getConstructors()[i].getName(), clazz.getConstructors()[i]);
                System.out.println(
                        "构造器" + i + "\n"
                        + clazz.getConstructors()[i] + "\n"
                        + "参数个数" + clazz.getConstructors()[i].getParameterCount() + "\n"
                        + "参数类型" + Arrays.toString(clazz.getConstructors()[i].getParameterTypes()) + "\n"
                );
            }
        } catch (SecurityException e) {
            System.out.println("获取失败！");
            throw new RuntimeException(e);
        }
    }

    //工厂方法
    public void createStudentClass() {
        System.out.println("创建" + className + "中的对象...");
        //创建一个输入器
        try (Scanner scanner = new Scanner(System.in)/*自动关闭输入器*/) {
            int forNum;//循环次数
            System.out.println("请输入要创建的学生数量：");
            while (true) {
                try {
                    forNum = scanner.nextInt();
                    break;//输入成功跳出循环
                } catch (Exception e) {//输入非法进入循环
                    System.out.println("输入有误，请重新输入：");
                    scanner.next();//清除输入
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
