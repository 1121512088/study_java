package com;

public class Demo03 {
	public static void main(String[] args) {
		boolean flag = true;
		flag = false;
		
//		byte a = 128;
		byte a = 122;
		
		short b = 3214;
		int c = 545465;
		long d = 4531454;
		
		
		float f = 3.14F;
		double g = 3.14;
		
		char h = 'A';

		// 上面这些都有基本数据类型的封装类  首字母大写
		System.out.println(Byte.MAX_VALUE + "," + Byte.MIN_VALUE + "," + Byte.SIZE);
		System.out.println(Long.MAX_VALUE + "," + Long.MIN_VALUE + "," + Long.SIZE);

	}
}
