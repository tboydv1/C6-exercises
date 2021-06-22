package com.strings;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {


    @BeforeEach
    void setUp() {
    }

    @Test
    void reverseString() {

        String initial = "68573565 234";

        StringBuilder reversed = new StringBuilder(initial.substring(initial.length()-3));
        reversed.append(") ");
        reversed.insert(0, "(+");

        int count = 0;
        for(int i = initial.length() - 5; i >= 0; i--){
            System.out.println( count % 3 + " "+ count);

            if(count % 3 == 0 && count > 0) {
//                count = 0;
                reversed.append("-");
            }
            reversed.append(initial.charAt(i));
            count++;

        }
        System.out.println(reversed);


    }

    @Test
    void checkUserInputIsPalindrome(){

        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("malam"));
        assertTrue(isPalindrome("radar"));
        assertFalse(isPalindrome("john"));
        assertTrue(isPalindrome("madaM"));
        assertFalse(isPalindrome("brown"));

    }

    boolean isPalindrome(String word){
        //reverse the word
        StringBuilder reversed = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--){
            reversed.append(word.charAt(i));
        }
        //compare the word with initial arg
        return reversed.toString().equalsIgnoreCase(word);
        //return result
    }

    @Test
    void createStringBuilderTest(){
        StringBuilder sb = new StringBuilder("Hello, how are you?");
        System.out.printf("Content --> %s%nLength is %d" +
                " | Capacity is %d%n",sb, sb.length(), sb.capacity());

        sb.ensureCapacity(75);
        System.out.println("After ensure capacity to 20 --> "+sb.capacity());

    }

    @Test
    void getCharsStringBuilderTest(){
        StringBuilder sb = new StringBuilder("Hello, how are you?");

        System.out.println(sb);
        char[] charArrays = new char[sb.length()];
        sb.getChars(7, sb.length(), charArrays, 5);
        System.out.println(Arrays.toString(charArrays));
    }


}