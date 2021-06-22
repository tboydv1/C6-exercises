package com.chp8;

public enum StoreTypes {

    PET("dogs"),
    FOOD("rice"),
    CLOTHING("jean");

    private String value;

    private StoreTypes(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
