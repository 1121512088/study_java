package com;

public class Demo09 {
  public static void main(String[] args) {
    // 由类产生对象的过程叫做实例化
    // 对象 Object == 实例 instance
    // 一个类可以创建多个实例
    Person tom = new Person();
    tom.name = "tom";
    tom.age = 18;
    tom.eat();
    tom.sleep();
    System.out.println(tom.name);
    // tom 实例 也可以访问  静态变量  pid
    System.out.println(tom.pid);

    System.out.println("--------------------");
    
    System.out.println(Person.pid);
    Person.m1();
    
    System.out.println("--------------------");
    Person rose = new Person("rose", 16);
    System.out.println(rose.name + rose.age);
  }
}

// 1.类和对象
// 2.构造方法
// 3.类变量和实例变量
// 4.类方法和实例方法
// 5.this关键字

// 类变量和类方法 也叫静态变量和静态方法
// 特点不需要实例化直接可以通过类名称来使用方法

// this 是一个指代对象 当前对象是谁 this 就是谁
class Person {
  // 实例变量
  String name;
  int age;

  // 构造方法: 每 new 一次 都会先执行该构造方法， 构造自己的方法。 构造方法名称必须跟 类名相同的
  // 详解： 是根据 new 后面的  Person() 我们知道 () 代表函数调用 相当于调用 Person()
  public Person() {
    System.out.println("构造方法");
  }

  public Person(String name, int age) { // 可以传参
    this.name = name;
    this.age = age;
  }
  
  // 静态变量 可以不需要实例化 直接通过类使用
  static int pid = 1;
  // 静态方法 可以不需要实例化 直接通过类使用
  static void m1() {
    System.out.println("m1...");
  }

  // 实例方法
  public void eat() {
    System.out.println("eat...");
  }

  public void sleep() {
    System.out.println("sleep...");
  }
}
