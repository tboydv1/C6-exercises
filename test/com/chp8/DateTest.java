package com.chp8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void dateObjectTest(){
        Date date1 = new Date(10, 14, 2002);
        assertEquals(date1.getMonth(), 10);
        assertEquals(date1.getDay(), 14);
        assertEquals(date1.getYear(), 2002);
        assertEquals(287, date1.getDaysInYear());

        System.out.println(date1);

    }

    @Test
    void dateObjectWithSecondConstructorTest(){
        Date date2 = new Date("July", 24, 2003);
        assertEquals(date2.getMonth(), 7);
        assertEquals(date2.getDay(), 24);
        assertEquals(date2.getYear(), 2003);

        System.out.println(date2);
    }

    @Test
    void dateObjectWithThirdConstructorTest(){
        Date date = new Date(50, 2003);
        assertEquals(2, date.getMonth());
        assertEquals(19, date.getDay());
        assertEquals(2003, date.getYear());

        System.out.println(date);
    }

    @Test
    void dateObjectWithThirdConstructorAndDifferentMonthTest(){
        Date date = new Date(180, 2003);
        assertEquals(06, date.getMonth());
        assertEquals(29, date.getDay());
        assertEquals(2003, date.getYear());

        System.out.println(date);
    }

    @Test
    void dateObjectWithThirdConstructorAndFirstMonthTest(){
        Date date = new Date(18, 2003);
        assertEquals(1, date.getMonth());
        assertEquals(18, date.getDay());
        assertEquals(2003, date.getYear());

        System.out.println(date);
    }


    @Test
    void dateObjectWithInvalidInput(){
        assertThrows(
                IllegalArgumentException.class, ()-> new Date(0, 35, 2002));
    }

}