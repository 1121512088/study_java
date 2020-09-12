package com.Poly;

public class Demo12 {
  public static void main(String[] args) {
    // 只是前缀是根据 Cat类型返回填写
    Cat c = new Cat();
    // 现在前缀 是Animal 猫也可以叫动物 所以这是向上类型转换
    Animal cat = new Cat();
    cat.eat();
    cat.sleep();

    // cat 跟 dog 都是Animal 这个到底是 猫 还是 狗 [这就方法的动态绑定] 根据 new Cat 还是 new Dog
    Animal dog = new Dog();
    dog.eat();
    dog.sleep();
    
    // 多态的例子：
    Person person = new Person();
    person.care(cat);
    person.care(dog);
  }
}

// 多态的例子：
class Person {
  // 养一个猫 就需要写一个猫 养一个狗 就需要写一个狗
//  public void care(Cat cat) {
//    cat.eat();
//    cat.sleep();
//  }
//  public void care(Dog dog) {
//    dog.eat();
//    dog.sleep();
//  }
  
  // 增加扩展性  只需要传一个参数动态执行
  public void care(Animal animal) {
    animal.eat();
    animal.sleep();
  }
}


// Java多态  一个方法多种状态
// 向上类型转换
// 方法的动态绑定
// 多态的例子

interface Animal {
  public void eat();

  public void sleep();
}

class Cat implements Animal {

  @Override
  public void eat() {
    System.out.println("cat eat");
  }

  @Override
  public void sleep() {
    System.out.println("cat eat");
  }

}

class Dog implements Animal {

  @Override
  public void eat() {
    System.out.println("dog eat");
  }

  @Override
  public void sleep() {
    System.out.println("dog sleep");
  }

}
