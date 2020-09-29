package com;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    String menu = "请选择：\n1: 入住  \n2: 退房\n3: 查房\n4: 退出系统 ";
    HotelManager hm = new HotelManager();
    hm.initRoom();
    System.out.println(menu);
    Scanner s = new Scanner(System.in);
    while (true) { // 一直执行循环语句    Scanner 当进入获取用户输入
      if (s.hasNext()) { // 进入获取用户的输入   hasNext
        int choice = s.nextInt(); // 获取用户输入
        switch (choice) {
        case 1:
          System.out.println("请输入入驻房间号：");
          Scanner s1 = new Scanner(System.in);
          if (s1.hasNext()) {
            String no = s1.next();
            hm.checkIn(no);
          }
          break;
        case 2:
          System.out.println("请输入退房房间号：");
          Scanner s2 = new Scanner(System.in);
          if (s2.hasNext()) {
            String no = s2.next();
            hm.checkOut(no);
          }
          break;
        case 3:
          hm.show();
          break;
        case 4:
          System.out.println("bye bye");
          System.exit(0);
          break;
        default:
          break;
        }
      }
    }

  }
}
