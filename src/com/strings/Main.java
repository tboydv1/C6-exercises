package com.strings;

import java.util.Arrays;

public class Main {

    static String str = "Hello World";
    public static void changeIt(String s){
        s = "Good bye world";
    }

    public static void main(String[] args) {
        {
            int i = 1234567890;
            float f = i;
            System.out.println(i - (int)f);
        }


    }



    }




//class Student implements Comparable<Student>{
//
//    int age;
//
//    public Student(int age){
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student student) {
//        return this.age - student.age;
//    }


class ATest {

    String global = "111";

    public int parse(String arg){
        var value = 0;
        try{
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.print(ct.parse("333"));
    }
}




