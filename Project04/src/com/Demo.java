package com;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    String menu = "��ѡ��\n1: ��ס  \n2: �˷�\n3: �鷿\n4: �˳�ϵͳ ";
    HotelManager hm = new HotelManager();
    hm.initRoom();
    System.out.println(menu);
    Scanner s = new Scanner(System.in);
    while (true) { // һֱִ��ѭ�����    Scanner �������ȡ�û�����
      if (s.hasNext()) { // �����ȡ�û�������   hasNext
        int choice = s.nextInt(); // ��ȡ�û�����
        switch (choice) {
        case 1:
          System.out.println("��������פ����ţ�");
          Scanner s1 = new Scanner(System.in);
          if (s1.hasNext()) {
            String no = s1.next();
            hm.checkIn(no);
          }
          break;
        case 2:
          System.out.println("�������˷�����ţ�");
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
