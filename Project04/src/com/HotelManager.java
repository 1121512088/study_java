package com;

import java.util.ArrayList;

public class HotelManager {
  ArrayList<Room> roomList = new ArrayList<Room>();

  public void initRoom() {
  
    Room r1 = new Room("101", 0);
    Room r2 = new Room("102", 0);
    Room r3 = new Room("103", 0);
    Room r4 = new Room("104", 0);
    Room r5 = new Room("105", 0);

    Room j1 = new Room("201", 0);
    Room j2 = new Room("202", 0);
    Room j3 = new Room("203", 0);
    Room j4 = new Room("204", 0);
    Room j5 = new Room("205", 0);
    
    roomList.add(r1);
    roomList.add(r2);
    roomList.add(r3);
    roomList.add(r4);
    roomList.add(r5);
    
    roomList.add(j1);
    roomList.add(j2);
    roomList.add(j3);
    roomList.add(j4);
    roomList.add(j5);
    
  }
  // 入住
  public void checkIn(String roomNo) {
    for (Room room : roomList) {
      if (room.getNo().equals(roomNo)) {
        if (room.getIsBooked() == 1) {
          System.out.println(roomNo + "房间有人");
        } else {
          room.setIsBooked(1);
          System.out.println("入住成功");
        }
        break;
      }
    }
  }
  // 退房
  public void checkOut(String roomNo) {
    for (Room room : roomList) {
      if (room.getNo().equals(roomNo)) {
        if (room.getIsBooked() == 0) {
          System.out.println(roomNo + "房间已经没人了");
        } else {
          room.setIsBooked(0);
          System.out.println("退房成功");
        }
        break;
      }
    }
  }
  
  public void show() {
    for (Room room : roomList) {
      System.out.println(room);
    }
  }
  
}
