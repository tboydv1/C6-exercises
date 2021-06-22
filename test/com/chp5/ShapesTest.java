package com.chp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void printTriaglesTest(){

        int stars = 1;

        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }

        System.out.println();

        stars  = 10;
        int space = 0;
        //Print triangle c
        for(int i = 0; i < 10; i++){

            for(int f = space; f > 0; f--){
                System.out.print(" ");
            }
            space++;
            //print stars
            for(int s = stars; s > 0; s--){
                System.out.print("*");
            }
            stars--;

            System.out.println();
        }


    }






    @Test
    void printTrianglesOnALinetest(){

        int t1 = 1, t2 = 10;
        int spaces1 = 12, spaces2 = 5;
        //Declare a loop for 10 iterations
        for(int i = 0; i < 10; i++){

            for(int a = 0; a < t1; a++){
                System.out.print("*");
            }

            for(int b = spaces1; b > 0; b--){
                System.out.print(" ");
            }

            for(int c = t2; c > 0; c--){
                System.out.print("*");
            }

            for(int d = spaces2; d > 0; d--){
                System.out.print(" ");
            }

            for(int c = t2; c > 0; c--){
                System.out.print("*");
            }

            for(int b = spaces1; b > 0; b--){
                System.out.print(" ");
            }

            for(int a = t1; a > 0; a--){
                System.out.print("*");
            }
            System.out.println();

            t1++; spaces1--; t2--; spaces2+=2;
        }


    }









    @Test
    void printBarChartTest() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        while(counter < 6){

            System.out.println("Enter number: ");
            number = input.nextInt();
            if(counter == 1 && number >= 1 && number <= 30){
                a = number;
                counter++;
            }
            else if(counter == 2 && number >= 1 && number <= 30){
                b = number;
                counter++;
            }
            else if(counter == 3 && number >= 1 && number <= 30){
                c = number;
                counter++;
            }
            else if(counter == 4 && number >= 1 && number <= 30){
                d = number;
                counter++;
            }
            else if(counter == 5 && number >= 1 && number <= 30){
                e = number;
                counter++;
            }
            else{
                System.out.println("Invalid input try again");
            }


        }

        int astericks = 0;
        for (int i = 0; i < 5; i++) {

            if (i == 0) {
                astericks = a;
            } else if (i == 1) {
                astericks = b;
            } else if (i == 2) {
                astericks = c;
            } else if (i == 3) {
                astericks = d;
            } else if (i == 4) {
                astericks = e;
            }
            for (int t = astericks; t > 0; t--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }








}