package com.seanyoung.main;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void forEachJava8() {
    List<String> data = new ArrayList<String>();
    data.add("training1");
    data.add("java1");
    data.add("8.0");
	data.add("YES")
	data.add("NO!")
 
    //print using method reference
    //data.forEach(System.out::println);
  }

  public static void main(String[] args) {
    forEachJava8();
  }
}
