package com;

public class Demo02 {
	public static void main(String[] args) {
//		System.out.println("hello");
		Boy Study = new Boy();
		Study.getMsg();
		Study.eat();
		Study.sleep();
		
		Boy tom = new Boy(); // ͬһ���ഴ����������
		tom.name = "rose";
		tom.age = 19;
		tom.getMsg();
		
	}
}
class Boy {
	String name = "Study";
	int age = 18;

	public void getMsg() {
		System.out.println(name + ',' + age);
	}

	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}
