package com.extend;

public class Demo11 {
  public static void main(String[] args) {
    // �̳�Animal
    // �̳п��Լ̳г�private˽���������һЩ���Ժͷ���
    // Object ��Java�еĶ������� ���磺class Animal Ĭ�ϼ̳еľ���Object
    Dog dog = new Dog();
    dog.eat();
  }
}

class Animal {
  private String str = "str";
  String name = "huahua";
  protected int age = 45;
  public String color = "��ɫ";

  public void eat() {
    System.out.println("eat ...");
  }

  private void m1() {
    System.out.println("m1...");
  }

  protected void m2() {
    System.out.println("m2...");
  }

  void m3() { // default Ĭ�ϵ�
    System.out.println("m3...");
  }
}

class Dog extends Animal {
  // �������ǣ����Ǹ����� eat����
  // �������Ǳ������ڼ̳й�ϵ�� ���า�Ǹ���ͬ������
  // ע�� �������Ǹ���������  ���׻��� ���Ա��Ե�ʱ�����׸��
  // super  ���������
  // this   ��ǰ����
  @Override
  public void eat() {
    super.eat(); // super ������Ǹ���
    System.out.println("Dog eat...");
  }
}

// �������� ����������ͬ �����ĸ����������Ͳ�ͬ
class Person {
  public void eat() {
    System.out.println("eat...");
  }

  public void eat(String str) {
    System.out.println("eat" + str);
  }
}
// ���췽��Ҳ��������
// ��Ҫע�����: ����һ��������ſ���
class Person2 {

  String name;
  int age;

  public Person2() {
    
  }

  public Person2(String name) {
    this.name = name;
  }

  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }

}
