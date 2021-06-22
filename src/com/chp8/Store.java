package com.chp8;

import com.chp5.PetStore;

public class Store {

    private String storeName;
    private String location;
    protected Integer id;

    public static String value;

    static {
        value = "Class has been loaded";
    }


  private enum TYPE {
        PET, FOOD
    }

        public Store(){
//            this("Default", "Default");
            this.storeName = "storeName";
            this.location = "location";
        }

    public Store(String storeName, String location, PetStore store){
        this.storeName = storeName;
        this.location = location;
    }


    public String getStoreName(){

        return this.storeName;
    }
    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public String location(){
        return this.location;
    }

    public void setLocation(String location){
        location = location;
    }


    @Override
    public String toString(){
        return String.format(
                "The %s store is located in %s",
                getStoreName(), location);
    }




}
