package com.extend;

public class Demo11 {
  public static void main(String[] args) {
    // 继承Animal
    // 继承可以继承除private私有属性外的一些属性和方法
    // Object 是Java中的顶级父类 列如：class Animal 默认继承的就是Object
    Dog dog = new Dog();
    dog.eat();
  }
}

class Animal {
  private String str = "str";
  String name = "huahua";
  protected int age = 45;
  public String color = "黑色";

  public void eat() {
    System.out.println("eat ...");
  }

  private void m1() {
    System.out.println("m1...");
  }

  protected void m2() {
    System.out.println("m2...");
  }

  void m3() { // default 默认的
    System.out.println("m3...");
  }
}

class Dog extends Animal {
  // 方法覆盖：覆盖父级的 eat方法
  // 方法覆盖必须是在继承关系内 子类覆盖父类同名方法
  // 注意 方法覆盖跟方法重载  容易混淆 面试笔试的时候容易搞混
  // super  父类的引用
  // this   当前对象
  @Override
  public void eat() {
    super.eat(); // super 代表的是父类
    System.out.println("Dog eat...");
  }
}

// 方法重载 方法名称相同 参数的个数或者类型不同
class Person {
  public void eat() {
    System.out.println("eat...");
  }

  public void eat(String str) {
    System.out.println("eat" + str);
  }
}
// 构造方法也可以重载
// 需要注意的是: 是在一个类里面才可以
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
