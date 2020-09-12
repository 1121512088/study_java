package com;

import java.util.Arrays;

public class Demo06 {
  // 1.数组的创建
  static void testArray() {
    int[] arr = { 1, 2, 3, 4 }; // java 常用
    // int array[] = { 4, 5, 6 };
    int[] arr2 = new int[5]; // int[5] 长度是5
    System.out.println(arr[0]);
    System.out.println(arr2[0]);

    System.out.println(arr2.length); // 长度为5
    System.out.println(arr2[0]);
    arr2[0] = 100;
    System.out.println(arr2[0]);
  }

  // 2. 数组的使用
  static void testArray2() {
    int[] arr = { 1, 2, 3, 4, 5 };

    // for each 循环方式
    for (int i : arr) {
      System.out.println(i); // i 每一项
    }
  }

  // 传参数组
  static void testArray3(String[] arr) {
    for (String i : arr) {
      System.out.println(i);
    }
  }

  // 返回数组
  static String[] testArray4() {
    String[] arr = { "a", "b", "c" };
    return arr;
  }

  // 3. Arrays的工具类
  static void testArray5() {
    int[] arr = { 6, 5, 2, 3, 1, 4 };
    // System.out.println(arr); // 返回 是一个指针 [I@15db9742
    Arrays.sort(arr); // 修改原数组 后 1 2 3 4 5 6
    
    for (int i : arr) {
      System.out.print(i + " ");
    }
    int idx = Arrays.binarySearch(arr, 6); // 找值的下标 未找到返回 -7
    System.out.println(idx);
  }

  public static void main(String[] args) {
    // testArray();
    // testArray2();
    // String[] arr = testArray4();
    // testArray3(arr);
    testArray5();
  }
}
