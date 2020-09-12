package com;

import java.util.Arrays;

public class Demo06 {
  // 1.����Ĵ���
  static void testArray() {
    int[] arr = { 1, 2, 3, 4 }; // java ����
    // int array[] = { 4, 5, 6 };
    int[] arr2 = new int[5]; // int[5] ������5
    System.out.println(arr[0]);
    System.out.println(arr2[0]);

    System.out.println(arr2.length); // ����Ϊ5
    System.out.println(arr2[0]);
    arr2[0] = 100;
    System.out.println(arr2[0]);
  }

  // 2. �����ʹ��
  static void testArray2() {
    int[] arr = { 1, 2, 3, 4, 5 };

    // for each ѭ����ʽ
    for (int i : arr) {
      System.out.println(i); // i ÿһ��
    }
  }

  // ��������
  static void testArray3(String[] arr) {
    for (String i : arr) {
      System.out.println(i);
    }
  }

  // ��������
  static String[] testArray4() {
    String[] arr = { "a", "b", "c" };
    return arr;
  }

  // 3. Arrays�Ĺ�����
  static void testArray5() {
    int[] arr = { 6, 5, 2, 3, 1, 4 };
    // System.out.println(arr); // ���� ��һ��ָ�� [I@15db9742
    Arrays.sort(arr); // �޸�ԭ���� �� 1 2 3 4 5 6
    
    for (int i : arr) {
      System.out.print(i + " ");
    }
    int idx = Arrays.binarySearch(arr, 6); // ��ֵ���±� δ�ҵ����� -7
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
