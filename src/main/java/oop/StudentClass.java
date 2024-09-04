package oop;

import java.util.Scanner;

public class StudentClass {//学生类

    public static void main(String[] args) {
    }
    //属性
    String name;//学生姓名
    int age;//学生年龄
    String className;//班级编号
    String stuId;//学生编号

    //构造方法
    StudentClass() {//无参构造法
        System.out.println("调用了学生类的无参构造法...");
    }

    StudentClass(String name,
                 String className,
                 String stuId,
                 int age) {//有参构造法
        System.out.println("调用了创建学生用的有参构造法...");
        this.name = name;
        this.className = className;
        this.stuId = stuId;
        this.age = age;
    }

    //方法--用于描述对象的行为
    void study() {//学习
        System.out.println("正在学习...");
    }

    void sayHi() {//自我介绍
        System.out.println(
            "大家好，我叫" + name
            + "，今年" + age
            + "岁了，所在班级为" + className
        );
    }

    void playWith(String anotherName) {//和同学玩
        System.out.println(
            name + "正在和"
            + anotherName + "玩。"
        );
    }
}
