package com;

// java�ַ���

public class Demo05 {
  static void testStr1() {
    String namec = "dom";
    String name = new String("dom");
    System.out.println(name);
    System.out.println(name.length());

    // �ַ�������
    String s1 = "s1";
    String s2 = "s2";
    System.out.println(s1 + s2);
    System.out.println(s1.concat(s2));

  }

  // �ַ�����ʽ�� String.format %c %d %s %b %f ���ﵥ��д�˼��� ����ɿ�����
  // %s ����string
  // %b ����boolean
  // %d ����double
  // %f ��������
  // ���Ǹ��ݻ������Ϳ�ͷ
  static void testStr2() {
    String name = "tom";
    int age = 20;
    double money = 5423;
    // %.2f ����չʾ2λС��
    System.out.println(String.format("�ҽ�%s,�ҽ���%d�꣬���ʣ�%f,���ʣ�%.2f", name, age, money, money));

  }

  // �ַ�������
  // charAt length substring trim indexOf ���ﵥ��д�˼��� ����ɿ�����
  static void testStr3() {
    String s = "hello world";
    System.out.println(s.charAt(0)); // �±���ֵ
    System.out.println(s.length()); // �ַ�������
    System.out.println(s.substring(0, 5)); // �ַ�������
    System.out.println(s.indexOf("world")); // ���±�

    String s2 = " a ";
    System.out.println(s2.trim()); // ȥ�����ҿո�
  }

  public static void main(String[] args) {
    // testStr1();
    // testStr2();
    testStr3();
  }
}
