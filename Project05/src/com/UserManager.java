package com;

import java.util.ArrayList;

public class UserManager {
  static ArrayList<User> userList = new ArrayList<User>();
  
  public static void add(User u) {
    userList.add(u);
  }
  
  public static ArrayList<User> getUserList() {
    return userList;
  }
  
}
