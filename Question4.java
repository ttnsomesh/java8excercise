package com.java8;
/*
Convert a string to uppercase and return
 */
import java.util.Scanner;

interface UpperCaseString{
    String changeToUppercase(String s1);
}

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String n1 = sc.next();
        UpperCaseString uu = (s1) -> {
          return s1.toUpperCase();
        };

        String u = uu.changeToUppercase(n1);
        System.out.println("uppercase : "+u);
    }
}
