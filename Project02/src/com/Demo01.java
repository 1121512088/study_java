package com;

public class Demo01 {
	static void testVar() { // testVar后的花括号  { // 局部变量      } 
		String name = "tom";
		int age = 18;
		String color = "黑白色";
		System.out.println(name + ',' + age + ',' + color);
	}
	public static void main(String[] args) {
		testVar();
	}
}
