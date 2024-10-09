package com.demo.maven;

public class Laptop {

//constructor to print how many times object created using objection creation in <bean> in spring.xml file
    public Laptop() {
        System.out.println("Laptop constructor");
    }

    public static void compile() {
        System.out.println("Compiling");
    }
}
