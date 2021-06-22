package com.chp8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store;

    @BeforeEach
    void setUp() {
        store = new Store();
    }
    @Test
    void printStoreAttributesTest(){
        store.setStoreName("Blue Ocean");
        store.setLocation("New york");

//        System.out.printf("The %s store is located in %s",
//                store.getStoreName(), store.location());
//
//        String message = store.getMessage();
//        System.out.println(message);

        System.out.println(store);

    }

    @Test
    void printEnumConstantsTest(){
        for(StoreTypes storeTypes: StoreTypes.values()){
            System.out.println(storeTypes);
        }

        int number = 5;
        int whole = number;
        String name = "Jane";
        Store storea = new Store();
        String lastname = name;
        name = "Peter";
        lastname = null;



        System.out.println(lastname);
        Store storeb = storea;
        storeb = null;
        storea = null;



    }

    @Test
    void staticScopeTest(){

        System.out.println(Store.value);
    }
}