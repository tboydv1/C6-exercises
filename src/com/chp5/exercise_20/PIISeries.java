package com.chp5.exercise_20;

public class PIISeries {


    public void caculatePiSeries(){

        //loop for 200,000
        double pii = 0;
        System.out.printf("Term    PiiValue%n");
        for(int i = 1; i <= 200_000; i++){

            if(i == 1){
                pii = 4;
            }
            else if(i % 2 == 0){
                pii = pii  -  (double) 4 / (i + (i - 1));
            }
            else{
                pii = pii +  (double) 4 / (i + (i - 1));
            }

            System.out.printf("%d%20f%n", i, pii);


        }


    }

}
