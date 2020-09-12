package com;

public class Demo09 {
  public static void main(String[] args) {
    // �����������Ĺ��̽���ʵ����
    // ���� Object == ʵ�� instance
    // һ������Դ������ʵ��
    Person tom = new Person();
    tom.name = "tom";
    tom.age = 18;
    tom.eat();
    tom.sleep();
    System.out.println(tom.name);
    // tom ʵ�� Ҳ���Է���  ��̬����  pid
    System.out.println(tom.pid);

    System.out.println("--------------------");
    
    System.out.println(Person.pid);
    Person.m1();
    
    System.out.println("--------------------");
    Person rose = new Person("rose", 16);
    System.out.println(rose.name + rose.age);
  }
}

// 1.��Ͷ���
// 2.���췽��
// 3.�������ʵ������
// 4.�෽����ʵ������
// 5.this�ؼ���

// ��������෽�� Ҳ�о�̬�����;�̬����
// �ص㲻��Ҫʵ����ֱ�ӿ���ͨ����������ʹ�÷���

// this ��һ��ָ������ ��ǰ������˭ this ����˭
class Person {
  // ʵ������
  String name;
  int age;

  // ���췽��: ÿ new һ�� ������ִ�иù��췽���� �����Լ��ķ����� ���췽�����Ʊ���� ������ͬ��
  // ��⣺ �Ǹ��� new �����  Person() ����֪�� () ���������� �൱�ڵ��� Person()
  public Person() {
    System.out.println("���췽��");
  }

  public Person(String name, int age) { // ���Դ���
    this.name = name;
    this.age = age;
  }
  
  // ��̬���� ���Բ���Ҫʵ���� ֱ��ͨ����ʹ��
  static int pid = 1;
  // ��̬���� ���Բ���Ҫʵ���� ֱ��ͨ����ʹ��
  static void m1() {
    System.out.println("m1...");
  }

  // ʵ������
  public void eat() {
    System.out.println("eat...");
  }

  public void sleep() {
    System.out.println("sleep...");
  }
}
