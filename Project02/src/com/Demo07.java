package com;

// ���̿���
// java ����ڳ��� main ��ʼִ��
// �������϶���˳��ִ�� �������������ã�������ת���������ô�����ִ�У�����ִ����ϣ�����ת�����÷�����

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
        continue; // �������� i ==0 ��ѭ�� 
      }
      System.out.println(i);
    }
  }
  
  static void testBreck() {
    int[] a = { 1, 2, 3 };

    for (int i = 0; i < a.length; i++) {
      if (i == 1) {
        break; // ��������ѭ�� 
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
