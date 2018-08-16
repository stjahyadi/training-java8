package com.seanyoung.main;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void forEachJava8() {
    List<String> data = new ArrayList<String>();
    data.add("training");
    data.add("java");
    data.add("8");
	data.add("YES")
	data.add("NO!")
 
    //print using method reference
    //data.forEach(System.out::println);
  }

  public static void main(String[] args) {
    forEachJava8();
  }
}
