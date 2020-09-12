package com;

// 流程控制
// java 从入口程序 main 开始执行
// 程序至上而下顺序执行 若遇到函数调用，程序跳转到方法调用处继续执行，方法执行完毕，在跳转到调用方法处

public class Demo07 {
  static void m1() {
    int[] a = { 1, 2, 3, 4 };
    for (int i : a) {
      System.out.println(i);
    }
  }

  static void testFor() {
    int[] a = { 1, 2, 3 };
    // for each
    for (int i : a) {
      System.out.println(i);
    }
    // for
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  static void testWhile() {
    int sum = 0;
    int i = 0;
    
    while (i <= 10) {
      sum += i;
      i++;
    }
    System.out.println(sum);
  }
  
  static void testDoWhile() {
    int sum = 0;
    int i = 0;
    
    do {
      sum += i;
      i++;
    } while (i <= 10);
    System.out.println(sum);
  }
  
  static void testContinue() {
    int[] a = { 1, 2, 3 };

    for (int i = 0; i < a.length; i++) {
      if (i == 0) {
        continue; // 跳出单个 i ==0 的循环 
      }
      System.out.println(i);
    }
  }
  
  static void testBreck() {
    int[] a = { 1, 2, 3 };

    for (int i = 0; i < a.length; i++) {
      if (i == 1) {
        break; // 跳出整个循环 
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    // System.out.println("start...");
    // m1();
    // System.out.println("end...");
    // testFor();
    // testWhile();
    // testContinue();
     testBreck();
  }
}
