package com.nt.test;

import com.nt.service.Arithmatic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Wellcome to GIT World");
        Arithmatic ar=new Arithmatic();
        long result=ar.sum(10, 20);
        System.out.println("result :"+ result);
    }
}
