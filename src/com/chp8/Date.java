package com.chp8;

public class Date {

    private final String[] MONTHS = {
            "January","February", "March",
            "April", "May", "June", "July",
            "August", "September", "October",
            "November","December"
    };

    private final int[] DAYS_IN_MONTHS =
            {
               31, 28, 31, 30, 31,
               30, 31, 31, 30, 31, 30, 31
            };

    private int month;
    private int day;
    private int year;
    private int daysInYear;

    public Date(int month, int day, int year){

        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Months out of range");
        }
        if(day < 1 || day > 31){
            throw new IllegalArgumentException("Day out of range");
        }

        this.month = month;
        this.day = day;
        this.year = year;
        this.daysInYear = calculateDaysInAYear(month, day);
    }
    public Date (String month, int day, int year){
        this.day = day;
        this.year = year;

        int result = getMonthIndex(month);
        if(result < 0){
            throw new IllegalArgumentException("Month is not valid");
        }
        this.month = result;
        this.daysInYear  = calculateDaysInAYear(this.month, this.day);
    }
    public Date(int days, int year){
        this.year = year;


        if(days <= 31 && days > 0){
          this.day = days;
          this.month = 1;
        }
        else{
            calculateMonthAndDay(days);
        }

        this.daysInYear = days;


    }

    private int getMonthIndex(String month){
        for(int i = 0; i < MONTHS.length; i++){
            if(month.equals(MONTHS[i])){
                return i + 1;
            }
        }
        return -1;
    }

    public int calculateDaysInAYear(int month, int day){
        int sum = day;
        for(int i = 0; i < month - 1; i++){
            sum += DAYS_IN_MONTHS[i];
        }
        return sum;
    }

    public void calculateMonthAndDay(int daysInAYear){
//        int count = 0;
        for(int i = 0; i < DAYS_IN_MONTHS.length; i++){
            daysInAYear -= DAYS_IN_MONTHS[i];

            if(daysInAYear <= 31 && daysInAYear > 0){
                //set day
                setDay(daysInAYear);
                //set month
                setMonth(i + 2);
            }
        }
    }

    public int getDaysInYear(){
        return this.daysInYear;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format(
                "%02d/%02d/%d%n%s %02d, %d%n%03d %d",
                month, day, year,
                this.MONTHS[month - 1], day, year,
                daysInYear, year);

    }
}
