package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly person = new RWOnly();
    // person.name = "Kush";
    // Error 'name' has private access in 'com.driver.RWOnly'

    person.setName("Kush");
    System.out.println(person.getName());
  }
}
