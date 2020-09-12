package com.Poly;

public class Demo12 {
  public static void main(String[] args) {
    // ֻ��ǰ׺�Ǹ��� Cat���ͷ�����д
    Cat c = new Cat();
    // ����ǰ׺ ��Animal èҲ���Խж��� ����������������ת��
    Animal cat = new Cat();
    cat.eat();
    cat.sleep();

    // cat �� dog ����Animal ��������� è ���� �� [��ͷ����Ķ�̬��] ���� new Cat ���� new Dog
    Animal dog = new Dog();
    dog.eat();
    dog.sleep();
    
    // ��̬�����ӣ�
    Person person = new Person();
    person.care(cat);
    person.care(dog);
  }
}

// ��̬�����ӣ�
class Person {
  // ��һ��è ����Ҫдһ��è ��һ���� ����Ҫдһ����
//  public void care(Cat cat) {
//    cat.eat();
//    cat.sleep();
//  }
//  public void care(Dog dog) {
//    dog.eat();
//    dog.sleep();
//  }
  
  // ������չ��  ֻ��Ҫ��һ��������ִ̬��
  public void care(Animal animal) {
    animal.eat();
    animal.sleep();
  }
}


// Java��̬  һ����������״̬
// ��������ת��
// �����Ķ�̬��
// ��̬������

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
