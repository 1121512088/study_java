package com;

// 数学运算和Java运算的区别 和联系

public class Demo04 {

  // 1. 算术运算 + - * /(会取整) %(取余数)
  static void testMath() {
    int a = (int) (Math.random() * 100);
    System.out.println("a=" + a);

    // 除0会出现异常报错
    int x = 0;
    // System.out.println(20 / 0);

    // %
    System.out.println(5 % 3);

    // 字符串 + 运算
    String name = "tom";
    int age = 99;
    System.out.println(name + "," + age);
  }

  // 2.关系运算 > >= < <= == !=
  static void testRelation() {
  }

  // 3. 逻辑运算 & | ! && ||
  static void testLogic() {
    // & 并且 (跟前端&& 一样 找假)
    System.out.println(false & true); // false
    System.out.println(true & false); // false

    // / 或者 (跟前端|| 一样 找真)
    System.out.println(false | true); // true
    System.out.println(true | false); // true

    // ! 取反
    System.out.println(!false); // true

    // && || 都是短路与运算 运算符
    // 如果前面的表达式可以确定结果 后面的表达式将不再计算
    System.out.println(false && true);
    System.out.println(true && false);

    // 【&跟&& 】 【| 跟 ||】区别
    // & | 判断区间 无论是否是匹配的值 每个语句都会执行
    // && || 判断区间 只要匹配第一个值 后面语句将不会执行
  }

  // 4. 赋值运算 = += -= *= /=
  static void testAssign() {
  }

  // 5. 自增自减去
  // 自增 (++), 将变量的值加1，分前缀式 (如++i) 和 后缀式 (i++) 前缀式是先加 1 再使用，后缀式是先使用再加 1。
  // 自减 (--), 将变量的值减1，分前缀式 (如 --i) 和 后缀式 (i--) 前缀式是先减 1 再使用，后缀式是先使用再减 1。
  static void testApp() {
    int i = 0;
    int y = i++; // 后缀++ 先 i 赋值给 y 在自身加 1
    System.out.println(i); // 0
    System.out.println(y); // 1
  }

  // 6. 三元运算 e1 ? e2 : e3  e1为真返回e2 为假返回e3
  static void testTerm() {

  }

  public static void main(String[] args) {
    // testMath();
    // testRelation();
    // testLogic();
    // testAssign();
    // testApp();
    testTerm();
  }
}
