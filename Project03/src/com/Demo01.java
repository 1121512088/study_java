package com;

import java.awt.Frame;
// GUI
public class Demo01 {
  public static void main(String[] args) {
    Frame f = new Frame("窗口标题");
    f.setLocation(20, 20);
    f.setSize(800, 600);
    f.setVisible(true);
    System.exit(0); // 退出系统
  }
}
