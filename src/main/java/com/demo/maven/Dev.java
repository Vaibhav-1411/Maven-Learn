package com.demo.maven;

public class Dev {
/*
int age; // if we use this then we can directly assign value here or in main class(App.java)
*/
//for setter we have to make it private //
private int age;

//constructor to print how many times object created using objection creation in <bean> in spring.xml file //
    public Dev() {
        System.out.println("Dev constructor");
    }

//if we are using getter setter to assign value to variable and variable is private and want to access outside class then code//
 
public int getAge() {
	return age; 
   }

public void setAge(int age){
	this.age=age;
  }



    public void build() {
        System.out.println("working on Awesome Project");
    }
}
