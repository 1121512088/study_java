package com;

// java字符串

public class Demo05 {
  static void testStr1() {
    String namec = "dom";
    String name = new String("dom");
    System.out.println(name);
    System.out.println(name.length());

    // 字符串连接
    String s1 = "s1";
    String s2 = "s2";
    System.out.println(s1 + s2);
    System.out.println(s1.concat(s2));

  }

  // 字符串格式化 String.format %c %d %s %b %f 这里单独写了几个 其余可看官网
  // %s 代表string
  // %b 代表boolean
  // %d 代表double
  // %f 代表浮点型
  // 都是根据基本类型开头
  static void testStr2() {
    String name = "tom";
    int age = 20;
    double money = 5423;
    // %.2f 代表展示2位小数
    System.out.println(String.format("我叫%s,我今年%d岁，工资：%f,工资：%.2f", name, age, money, money));

  }

  // 字符串方法
  // charAt length substring trim indexOf 这里单独写了几个 其余可看官网
  static void testStr3() {
    String s = "hello world";
    System.out.println(s.charAt(0)); // 下标找值
    System.out.println(s.length()); // 字符串长度
    System.out.println(s.substring(0, 5)); // 字符串长度
    System.out.println(s.indexOf("world")); // 找下标

    String s2 = " a ";
    System.out.println(s2.trim()); // 去除左右空格
  }

  public static void main(String[] args) {
    // testStr1();
    // testStr2();
    testStr3();
  }
}
